

package com.launcher.launcher.install;

import lombok.NonNull;
import lombok.extern.java.Log;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import static com.launcher.launcher.util.SharedLocale.tr;

@Log
public class FileMover implements InstallTask {

    private final File from;
    private final File to;

    public FileMover(@NonNull File from, @NonNull File to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute() throws IOException {
        log.log(Level.INFO, "Moving to {0} (from {1})...", new Object[]{to.getAbsoluteFile(), from.getName()});
        to.getParentFile().mkdirs();
        to.delete();
        from.renameTo(to);
    }

    @Override
    public double getProgress() {
        return -1;
    }

    @Override
    public String getStatus() {
        return tr("installer.movingFile", from, to);
    }

}
