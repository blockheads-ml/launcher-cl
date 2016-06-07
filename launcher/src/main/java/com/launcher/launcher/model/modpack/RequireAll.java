

package com.launcher.launcher.model.modpack;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class RequireAll implements Condition {

    private List<Feature> features = new ArrayList<Feature>();

    public RequireAll() {
    }

    public RequireAll(List<Feature> features) {
        this.features = features;
    }

    public RequireAll(Feature... feature) {
        features.addAll(Arrays.asList(feature));
    }

    @Override
    public boolean matches() {
        if (features == null) {
            return true;
        }

        for (Feature feature : features) {
            if (!feature.isSelected()) {
                return false;
            }
        }

        return true;
    }

}
