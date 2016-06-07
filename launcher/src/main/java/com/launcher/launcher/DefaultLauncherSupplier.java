package com.launcher.launcher;

import com.google.common.base.Supplier;
import com.launcher.launcher.dialog.LauncherFrame;

import java.awt.*;

public class DefaultLauncherSupplier implements Supplier<Window> {

    private final Launcher launcher;

    public DefaultLauncherSupplier(Launcher launcher) {
        this.launcher = launcher;
    }

    @Override
    public Window get() {
        return new LauncherFrame(launcher);
    }

}
