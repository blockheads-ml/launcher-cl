

package com.launcher.launcher.model.modpack;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="if")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RequireAny.class, name = "requireAny"),
        @JsonSubTypes.Type(value = RequireAll.class, name = "requireAll")
})
public interface Condition {

    boolean matches();

}
