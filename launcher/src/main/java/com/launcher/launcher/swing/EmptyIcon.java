

package com.launcher.launcher.swing;

import javax.swing.*;
import java.awt.*;

public final class EmptyIcon implements Icon {

    private int width;
    private int height;

    public EmptyIcon() {
        this(0, 0);
    }

    public EmptyIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getIconHeight() {
        return height;
    }

    public int getIconWidth() {
        return width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
    }

}
