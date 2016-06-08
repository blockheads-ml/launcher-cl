

package com.launcher.launcher.install;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class FeatureCache {

    private Map<String, Boolean> selected = new HashMap<String, Boolean>();

}
