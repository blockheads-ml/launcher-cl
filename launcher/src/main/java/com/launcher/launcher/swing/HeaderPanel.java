

package com.launcher.launcher.swing;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        setBackground(new Color(0xDB5036));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 60);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
