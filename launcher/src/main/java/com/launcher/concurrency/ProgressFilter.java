

package com.launcher.concurrency;

public class ProgressFilter implements ProgressObservable {

    private final ProgressObservable delegate;
    private final double offset;
    private final double portion;

    public ProgressFilter(ProgressObservable delegate, double offset, double portion) {
        this.delegate = delegate;
        this.offset = offset;
        this.portion = portion;
    }

    @Override
    public double getProgress() {
        return offset + portion * Math.max(0, delegate.getProgress());
    }

    @Override
    public String getStatus() {
        return delegate.getStatus();
    }

    public static ProgressObservable between(ProgressObservable delegate, double from, double to) {
        return new ProgressFilter(delegate, from, to - from);
    }

}
