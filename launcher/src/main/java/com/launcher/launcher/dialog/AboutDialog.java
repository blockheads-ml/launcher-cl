// CraftersLand.net Launcher

package com.launcher.launcher.dialog;

import com.launcher.launcher.swing.ActionListeners;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AboutDialog extends JDialog {

    public AboutDialog(Window parent) {
        super(parent, "About", ModalityType.DOCUMENT_MODAL);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        initComponents();
        setResizable(false);
        pack();
        setLocationRelativeTo(parent);
    }

    private void initComponents() {
        JPanel container = new JPanel();
        container.setLayout(new MigLayout("insets dialog"));

        container.add(new JLabel("<html><center><h1>CraftersLand.net Launcher</h1></center>"), "wrap, gapbottom unrel");
        container.add(new JLabel("<html><center>This launcher is in development and bugs should NOT be reported.</center>"), "wrap, gapbottom unrel");
        container.add(new JLabel("<html><center>CraftersLand.net does not currently endorse this launcher.</center>"), "wrap, gapbottom unrel");
        container.add(new JLabel("<html><center>-----------------------------------</center>"), "wrap, gapbottom unrel");

        container.add(new JLabel("<html><center><img src=http://launcher.blockheads.ml/launcher/sig.png></center>"), "wrap, gapbottom unrel");

        JButton okButton = new JButton("OK");
        JButton sourceCodeButton = new JButton("Launcher Forum Thread");

        container.add(sourceCodeButton, "span, split 3, sizegroup bttn");
        container.add(okButton, "tag ok, sizegroup bttn");

        add(container, BorderLayout.CENTER);

        getRootPane().setDefaultButton(okButton);
        getRootPane().registerKeyboardAction(ActionListeners.dispose(this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);

        okButton.addActionListener(ActionListeners.dispose(this));
        sourceCodeButton.addActionListener(ActionListeners.openURL(this, "http://forum.craftersland.net/topic/14681-custom-launcher/"));
    }

    public static void showAboutDialog(Window parent) {
        AboutDialog dialog = new AboutDialog(parent);
        dialog.setVisible(true);
    }
}
