

package com.launcher.launcher.model.modpack;

import com.google.common.collect.Lists;
import com.launcher.launcher.launch.JavaProcessBuilder;
import lombok.Data;

import java.util.List;

@Data
public class LaunchModifier {

    private List<String> flags = Lists.newArrayList();

    public void setFlags(List<String> flags) {
        this.flags = flags != null ? flags : Lists.<String>newArrayList();
    }

    public void modify(JavaProcessBuilder builder) {
        if (flags != null) {
            for (String flag : flags) {
                builder.getFlags().add(flag);
            }
        }
    }
}
