

package com.launcher.launcher.model.modpack;

import lombok.Data;

import java.util.List;

@Data
public class PackageList {

    public static final int MIN_VERSION = 1;

    private int minimumVersion;
    private List<ManifestInfo> packages;

}
