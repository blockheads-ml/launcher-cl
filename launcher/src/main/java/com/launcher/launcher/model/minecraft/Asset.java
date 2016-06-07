

package com.launcher.launcher.model.minecraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Asset {

    private String hash;
    private int size;

}
