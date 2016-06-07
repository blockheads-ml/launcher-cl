

package com.launcher.concurrency;

public interface Callback<T> {

    void handle(T value);

}
