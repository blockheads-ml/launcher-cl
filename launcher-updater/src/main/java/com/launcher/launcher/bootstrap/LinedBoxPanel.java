package com.launcher.launcher.bootstrap;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class LinedBoxPanel extends JPanel {

    @Getter
    private final boolean horizontal;
    @Getter @Setter
    private int spacing = 6;
    private boolean needsSpacer = false;

    public LinedBoxPanel(boolean horizontal) {
        this.horizontal = horizontal;
        setLayout(new BoxLayout(this,
                horizontal ? BoxLayout.X_AXIS : BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
    }

    public LinedBoxPanel fullyPadded() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return this;
    }

    public void addElement(Component component) {
        if (needsSpacer) {
            add(horizontal ?
                    Box.createHorizontalStrut(spacing) :
                    Box.createVerticalStrut(spacing));
        }
        add(component);
        needsSpacer = true;
    }

    public void addGlue() {
        add(horizontal ?
                Box.createHorizontalGlue() :
                Box.createVerticalGlue());
        needsSpacer = false;
    }

}
