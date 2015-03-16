/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Edwin
 */
public class ConsolePanel extends JPanel {

    JTextArea textArea;

    public ConsolePanel() {
        setLayout(new BorderLayout());
        Dimension size = getPreferredSize();
        size.height = 55;
        setPreferredSize(size);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setBackground(null);
        
        textArea.setBorder(BorderFactory.createTitledBorder("Console"));
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void clearText() {
        textArea.setText(null);
    }
}
