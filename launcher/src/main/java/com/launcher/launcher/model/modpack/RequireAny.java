

package com.launcher.launcher.model.modpack;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class RequireAny implements Condition {

    private List<Feature> features = new ArrayList<Feature>();

    public RequireAny() {
    }

    public RequireAny(List<Feature> features) {
        this.features = features;
    }

    public RequireAny(Feature... feature) {
        features.addAll(Arrays.asList(feature));
    }

    @Override
    public boolean matches() {
        if (features == null) {
            return true;
        }

        for (Feature feature : features) {
            if (feature.isSelected()) {
                return true;
            }
        }

        return false;
    }

}
