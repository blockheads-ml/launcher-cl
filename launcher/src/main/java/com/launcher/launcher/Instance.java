

package com.launcher.launcher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.io.Files;
import com.launcher.launcher.launch.JavaProcessBuilder;
import com.launcher.launcher.model.modpack.LaunchModifier;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;


@Data
public class Instance implements Comparable<Instance> {

    private String title;
    private String name;
    private String version;
    private boolean updatePending;
    private boolean installed;
    private Date lastAccessed;
    @JsonProperty("launch")
    private LaunchModifier launchModifier;

    @JsonIgnore private File dir;
    @JsonIgnore private URL manifestURL;
    @JsonIgnore private int priority;
    @JsonIgnore private boolean selected;
    @JsonIgnore private boolean local;


    public String getTitle() {
        return title != null ? title : name;
    }


    public void modify(JavaProcessBuilder builder) {
        if (launchModifier != null) {
            launchModifier.modify(builder);
        }
    }


    public File getDir() {
        try {
            Files.createParentDirs(dir);
            dir.mkdir();
        } catch (IOException ignored) {
        }
        return dir;
    }


    @JsonIgnore
    public File getContentDir() {
        File dir = new File(this.dir, "minecraft");
        try {
            Files.createParentDirs(dir);
            dir.mkdir();
        } catch (IOException ignored) {
        }
        return dir;
    }


    @JsonIgnore
    public File getManifestPath() {
        return new File(getDir(), "manifest.json");
    }


    @JsonIgnore
    public File getVersionPath() {
        return new File(getDir(), "version.json");
    }


    @JsonIgnore
    public File getCustomJarPath() {
        return new File(getContentDir(), "custom_jar.jar");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public int compareTo(Instance o) {
        if (isLocal() && !o.isLocal()) {
            return -1;
        } else if (!isLocal() && o.isLocal()) {
            return 1;
        } else if (isLocal() && o.isLocal()) {
            Date otherDate = o.getLastAccessed();

            if (otherDate == null && lastAccessed == null) {
                return 0;
            } else if (otherDate == null) {
                return -1;
            } else if (lastAccessed == null) {
                return 1;
            } else {
                return -lastAccessed.compareTo(otherDate);
            }
        } else {
            if (priority > o.priority) {
                return -1;
            } else if (priority < o.priority) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
