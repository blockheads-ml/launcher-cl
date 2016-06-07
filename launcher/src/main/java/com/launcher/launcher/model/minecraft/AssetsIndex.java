

package com.launcher.launcher.model.minecraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.launcher.launcher.AssetsRoot;
import lombok.Data;
import lombok.NonNull;

import java.io.File;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssetsIndex {

    private boolean virtual;
    private Map<String, Asset> objects;

    public File getObjectPath(@NonNull AssetsRoot assetsRoot, @NonNull String name) {
        Asset asset = objects.get(name);
        if (asset != null) {
            return assetsRoot.getObjectPath(asset);
        } else {
            return null;
        }
    }

}
