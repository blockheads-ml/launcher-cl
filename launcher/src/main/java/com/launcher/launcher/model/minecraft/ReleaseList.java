

package com.launcher.launcher.model.minecraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseList {

    private LatestReleases latest;
    private List<Version> versions;

    /**
     * Get a release with the given ID.
     *
     * @param id the ID
     * @return the release
     */
    public Version find(@NonNull String id) {
        for (Version version : getVersions()) {
            if (version.getId().equals(id)) {
                return version;
            }
        }
        return null;
    }

    @Data
    public static class LatestReleases {
        private String snapshot;
        private String release;
    }

}
