

package com.launcher.launcher.selfupdate;

import lombok.Data;

import java.net.URL;

@Data
public class LatestVersionInfo {

    private String version;
    private URL url;

}
