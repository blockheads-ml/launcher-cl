

package com.launcher.concurrency;

import lombok.Data;

/**
 * A simple default implementation of {@link com.launcher.concurrency.ProgressObservable}
 * with settable properties.
 */
@Data
public class DefaultProgress implements ProgressObservable {

    private String status;
    private double progress = -1;

    public DefaultProgress() {
    }

    public DefaultProgress(double progress, String status) {
        this.progress = progress;
        this.status = status;
    }
}
