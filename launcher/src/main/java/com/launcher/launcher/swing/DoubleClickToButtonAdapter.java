

package com.launcher.launcher.swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DoubleClickToButtonAdapter extends MouseAdapter {

    private final AbstractButton button;

    public DoubleClickToButtonAdapter(AbstractButton button) {
        this.button = button;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            button.doClick();
        }
    }

}
