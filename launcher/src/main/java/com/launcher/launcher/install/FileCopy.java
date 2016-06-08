

package com.launcher.launcher.install;

import com.google.common.io.Files;
import lombok.NonNull;
import lombok.extern.java.Log;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import static com.launcher.launcher.util.SharedLocale.tr;

@Log
public class FileCopy implements InstallTask {

    private final File from;
    private final File to;

    public FileCopy(@NonNull File from, @NonNull File to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute() throws IOException {
        log.log(Level.INFO, "Copying to {0} (from {1})...", new Object[]{to.getAbsoluteFile(), from.getName()});
        to.getParentFile().mkdirs();
        Files.copy(from, to);
    }

    @Override
    public double getProgress() {
        return -1;
    }

    @Override
    public String getStatus() {
        return tr("installer.copyingFile", from, to);
    }

}
