

package com.launcher.launcher.model.loader;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstallData {

    private String path;
    private String filePath;

}
