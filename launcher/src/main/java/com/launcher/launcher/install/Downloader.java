

package com.launcher.launcher.install;

import com.launcher.concurrency.ProgressObservable;

import java.io.File;
import java.net.URL;
import java.util.List;


public interface Downloader extends ProgressObservable {

    File download(List<URL> urls, String key, long size, String name);

    File download(URL url, String key, long size, String name);
}
