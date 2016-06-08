

package com.launcher.launcher;

import com.beust.jcommander.Parameter;
import lombok.Data;

import java.io.File;

/**
 * The command line arguments that the launcher accepts.
 */
@Data
public class LauncherArguments {

    @Parameter(names = "--dir")
    private File dir;

    @Parameter(names = "--bootstrap-version")
    private Integer bootstrapVersion;

    @Parameter(names = "--portable")
    private boolean portable;

}
