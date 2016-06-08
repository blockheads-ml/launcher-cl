

package com.launcher.launcher.install;

import com.launcher.concurrency.ProgressObservable;

public interface InstallTask extends ProgressObservable {

    void execute() throws Exception;

}
