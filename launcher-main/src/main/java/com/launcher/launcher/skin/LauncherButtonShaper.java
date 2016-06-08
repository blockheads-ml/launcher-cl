package com.launcher.launcher.skin;

import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

import javax.swing.*;
import java.awt.*;

public class LauncherButtonShaper extends ClassicButtonShaper {

    public Dimension getPreferredSize(AbstractButton button, Dimension uiPreferredSize) {
        Dimension size = super.getPreferredSize(button, uiPreferredSize);
        return new Dimension(size.width + 5, size.height + 4);
    }

}
