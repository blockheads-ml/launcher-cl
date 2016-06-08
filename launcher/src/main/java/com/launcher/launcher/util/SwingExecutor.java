

package com.launcher.launcher.util;

import com.google.common.util.concurrent.AbstractListeningExecutorService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class SwingExecutor extends AbstractListeningExecutorService {

    public static final SwingExecutor INSTANCE = new SwingExecutor();

    private SwingExecutor() {
    }

    @Override
    public void execute(Runnable runnable) {
        SwingUtilities.invokeLater(runnable);
    }

    @Override
    public void shutdown() {
    }

    @Override
    public List<Runnable> shutdownNow() {
        return new ArrayList<Runnable>();
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }
}
