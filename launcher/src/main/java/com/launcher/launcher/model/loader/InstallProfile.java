

package com.launcher.launcher.model.loader;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstallProfile {

    @JsonProperty("install")
    private InstallData installData;
    private VersionInfo versionInfo;

}
