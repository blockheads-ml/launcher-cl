package com.launcher.launcher.bootstrap;

/**
 * Implementations of this interface can provide information on the progress
 * of a task.
 */
public interface ProgressObservable {

    /**
     * Get the progress value as a number between 0 and 1 (inclusive), or -1
     * if progress information is unavailable.
     *
     * @return the progress value
     */
    double getProgress();

}
