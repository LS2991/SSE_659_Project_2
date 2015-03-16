/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Edwin
 */
public class OutputPanel extends JPanel {

    JTextArea textArea;

    public OutputPanel() {
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBorder(BorderFactory.createTitledBorder("Address Book"));
        add(scroll, BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void clearText() {
        textArea.setText(null);
    }

}
