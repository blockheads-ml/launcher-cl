

package com.launcher.launcher.model.modpack;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ManifestInfo extends BaseManifest implements Comparable<ManifestInfo> {

    private String location;
    private int priority;

    @Override
    public int compareTo(ManifestInfo o) {
        if (priority > o.getPriority()) {
            return -1;
        } else if (priority < o.getPriority()) {
            return 1;
        } else {
            return 0;
        }
    }

}
