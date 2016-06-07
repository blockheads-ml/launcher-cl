

package com.launcher.launcher.swing;

import javax.swing.*;
import javax.swing.table.TableModel;

public class CheckboxTable extends DefaultTable {

    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
        try {
            getColumnModel().getColumn(0).setMaxWidth((int) new JCheckBox().getPreferredSize().getWidth());
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

}
