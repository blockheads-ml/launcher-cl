

package com.launcher.launcher.swing;

import javax.swing.table.TableModel;

public class InstanceTable extends DefaultTable {

    public InstanceTable() {
        super();
        setTableHeader(null);
    }

    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
        try {
            getColumnModel().getColumn(0).setMaxWidth(24);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
