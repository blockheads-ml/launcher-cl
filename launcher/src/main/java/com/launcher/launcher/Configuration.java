

package com.launcher.launcher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * The configuration for the launcher.
 * </p>
 * Default values are stored as field values. Note that if a default
 * value is changed after the launcher has been deployed, it may not take effect
 * for users who have already used the launcher because the old default
 * values would have been written to disk.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Configuration {

    private boolean offlineEnabled = false;
    private String jvmPath;
    private String jvmArgs;
    private int minMemory = 1024;
    private int maxMemory = 4096; // Updated in Launcher
    private int permGen = 1024;
    private int windowWidth = 854;
    private int widowHeight = 480;
    private boolean proxyEnabled = false;
    private String proxyHost = "localhost";
    private int proxyPort = 8080;
    private String proxyUsername;
    private String proxyPassword;
    private String gameKey;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
