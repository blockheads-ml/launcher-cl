

package com.launcher.launcher.model.loader;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.launcher.launcher.model.minecraft.Library;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionInfo {

    private String minecraftArguments;
    private String mainClass;
    private List<Library> libraries;

}
