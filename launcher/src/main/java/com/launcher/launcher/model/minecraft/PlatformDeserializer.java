

package com.launcher.launcher.model.minecraft;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.launcher.launcher.util.Platform;

import java.io.IOException;

public class PlatformDeserializer extends JsonDeserializer<Platform> {

    @Override
    public Platform deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String text = jsonParser.getText();
        if (text.equalsIgnoreCase("windows")) {
            return Platform.WINDOWS;
        } else if (text.equalsIgnoreCase("linux")) {
            return Platform.LINUX;
        } else if (text.equalsIgnoreCase("solaris")) {
            return Platform.SOLARIS;
        } else if (text.equalsIgnoreCase("osx")) {
            return Platform.MAC_OS_X;
        } else {
            throw new IOException("Unknown platform: " + text);
        }
    }

}
