

package com.launcher.launcher.model.minecraft;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.launcher.launcher.util.Platform;

import java.io.IOException;

public class PlatformSerializer extends JsonSerializer<Platform> {

    @Override
    public void serialize(Platform platform, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        switch (platform) {
            case WINDOWS:
                jsonGenerator.writeString("windows");
                break;
            case MAC_OS_X:
                jsonGenerator.writeString("osx");
                break;
            case LINUX:
                jsonGenerator.writeString("linux");
                break;
            case SOLARIS:
                jsonGenerator.writeString("solaris");
                break;
            case UNKNOWN:
                jsonGenerator.writeNull();
                break;
        }
    }

}
