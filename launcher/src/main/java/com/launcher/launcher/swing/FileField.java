

package com.launcher.launcher.swing;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class FileField extends DirectoryField {

    private final String title;
    private final String description;

    public FileField(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    protected JFileChooser getFileChooser() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }

            @Override
            public String getDescription() {
                return description;
            }
        });

        return chooser;
    }

}
