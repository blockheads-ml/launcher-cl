

package com.launcher.launcher.swing;

import java.awt.*;
import java.util.concurrent.Executor;

public class EventQueueExecutor implements Executor {

    public static final EventQueueExecutor INSTANCE = new EventQueueExecutor();

    private EventQueueExecutor() {
    }

    @Override
    public void execute(Runnable runnable) {
        EventQueue.invokeLater(runnable);
    }

}
