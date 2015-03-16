/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Edwin
 */
public class RootContainer extends JFrame {

    private FirstPanel fPanel;
    private ConsolePanel cPanel;
    private OutputPanel oPanel;

    public RootContainer() {
        super();
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        setTitle("My Address Book");
        fPanel = new FirstPanel();
        cPanel = new ConsolePanel();
        oPanel = new OutputPanel();
        Container c = getContentPane();
        c.add(oPanel, BorderLayout.CENTER);
        c.add(cPanel, BorderLayout.SOUTH);
        
        c.add(fPanel, BorderLayout.NORTH);
        fPanel.sendOPanel(oPanel);
        fPanel.sendCPanel(cPanel);
// fPanel.addTextListener(new TextListener() {
// public void detailEventOccurred(TextEvent event) {
// String text = event.getText();
// oPanel.appendText(text);
// }
// });
// fPanel.addTextListener2(new TextListener() {
// public void detailEventOccurred(TextEvent event) {
// String text = event.getText();
// sPanel.clearText();
// sPanel.appendText("Address Book has added -- " + text);
// }
// });
// button.addActionListener(new ActionListener() {
//
// @Override
// public void actionPerformed(ActionEvent e) {
// textArea.append("New Contact \n");
// }
//
// });
    }

}
