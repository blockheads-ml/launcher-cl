

package com.launcher.launcher.swing;

import javax.swing.*;
import java.awt.*;

/**
 * The default table style used throughout the launcher.
 */
public class DefaultTable extends JTable {

    public DefaultTable() {
        setShowGrid(false);
        setRowHeight((int) (Math.max(getRowHeight(), new JCheckBox().getPreferredSize().getHeight() - 2)));
        setIntercellSpacing(new Dimension(0, 0));
        setFillsViewportHeight(true);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

}
