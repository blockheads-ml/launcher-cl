

package com.launcher.launcher.install;

import com.launcher.concurrency.ProgressObservable;
import com.launcher.launcher.util.SharedLocale;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.java.Log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.launcher.launcher.LauncherUtils.checkInterrupted;
import static com.launcher.launcher.util.SharedLocale.tr;

@Log
public class Installer implements ProgressObservable {

    @Getter private final File tempDir;
    private final HttpDownloader downloader;
    private InstallTask running;
    private int count = 0;
    private int finished = 0;

    private List<InstallTask> queue = new ArrayList<InstallTask>();

    public Installer(@NonNull File tempDir) {
        this.tempDir = tempDir;
        this.downloader = new HttpDownloader(tempDir);
    }

    public synchronized void queue(@NonNull InstallTask runnable) {
        queue.add(runnable);
        count++;
    }

    public void download() throws IOException, InterruptedException {
        downloader.execute();
    }

    public synchronized void execute() throws Exception {
        queue = Collections.unmodifiableList(queue);

        try {
            for (InstallTask runnable : queue) {
                checkInterrupted();
                running = runnable;
                runnable.execute();
                finished++;
            }
        } finally {
            running = null;
        }
    }

    public Downloader getDownloader() {
        return downloader;
    }

    @Override
    public double getProgress() {
        return finished / (double) count;
    }

    @Override
    public String getStatus() {
        InstallTask running = this.running;
        if (running != null) {
            String status = running.getStatus();
            if (status == null) {
                status = running.toString();
            }
            return tr("installer.executing", count - finished) + "\n" + status;
        } else {
            return SharedLocale.tr("installer.installing");
        }
    }
}
