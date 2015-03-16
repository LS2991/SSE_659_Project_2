package frameclass;

import frameclass.ConsolePanel;
import frameclass.OutputPanel;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;

public class FirstPanel extends JPanel {

    private OutputPanel opanel;
    private ConsolePanel cpanel;
    private EventListenerList listenerList = new EventListenerList();

    private EventListenerList listenerList2 = new EventListenerList();

    public FirstPanel() {
        Dimension size = getPreferredSize();
        size.height = 225;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("Contact Info"));
        JLabel fNameL = new JLabel("First Name: ");
        JLabel lNameL = new JLabel("Last Name: ");
        final JTextField fNameF = new JTextField(10);
        final JTextField lNameF = new JTextField(10);
        JLabel emailL = new JLabel("Email Address: ");
        JLabel phoneL = new JLabel("Phone Number: ");
        final JTextField emailF = new JTextField(15);
        final JTextField phoneF = new JTextField(7);
        JButton Btn = new JButton("Add Contact");
        JLabel space = new JLabel(" ");
        Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String first = fNameF.getText();
                String last = lNameF.getText();
                String email = emailF.getText();
                String phone = phoneF.getText();
                String text = last + ", " + first + "\n" + email + "\n" + phone + "\n\n";
                setText1(text);
                String text2 = first + " " + last;
                setText2(text2);
// fireBtnEvent(new TextEvent(this, text));
// fireBtnEvent2(new TextEvent(this, text2));
            }
        });
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx = 1;
        gc.weighty = 5;
        gc.gridx = 0;
        gc.gridy = 0;

        add(fNameL, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(lNameL, gc);
        gc.gridx = 0;
        gc.gridy = 2;
        add(emailL, gc);
        gc.gridx = 0;
        gc.gridy = 3;
        add(phoneL, gc);
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 0;
        add(fNameF, gc);
        gc.gridx = 1;
        gc.gridy = 1;
        add(lNameF, gc);
        gc.gridx = 1;
        gc.gridy = 2;
        add(emailF, gc);
        gc.gridx = 1;
        gc.gridy = 3;
        add(phoneF, gc);
        gc.weighty = .5;
        gc.gridx = 1;
        gc.gridy = 4;
        add(space, gc);
        gc.weighty = 10;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx = 1;
        gc.gridy = 5;
        add(Btn, gc);
    }

    public void sendOPanel(OutputPanel panel) {
        opanel = panel;
    }

    public void sendCPanel(ConsolePanel panel) {
        cpanel = panel;
    }

    public void setText1(String text) {
        opanel.appendText(text);
    }

    public void setText2(String text) {
        cpanel.clearText();
        cpanel.appendText("Address Book has added -- " + text);
    }
// public void fireBtnEvent(TextEvent event) {
// Object[] listeners = listenerList.getListenerList();
// for(int i=0; i < listeners.length; i += 2) {
// if(listeners[i] == TextListener.class) {
// ((TextListener)listeners[i+1]).detailEventOccurred(event);
// }
// }
// }
//
// public void fireBtnEvent2(TextEvent event) {
// Object[] listeners = listenerList2.getListenerList();
// for(int i=0; i < listeners.length; i += 2) {
// if(listeners[i] == TextListener.class) {
// ((TextListener)listeners[i+1]).detailEventOccurred(event);
// }
// }
// }
//
// public void addTextListener(TextListener listener) {
// listenerList.add(TextListener.class, listener);
// }
//
// public void addTextListener2(TextListener listener) {
// listenerList2.add(TextListener.class, listener);
// }
//
// public void removeTextListener(TextListener listener) {
// listenerList.remove(TextListener.class, listener);
// }
//
// public void removeTextListener2(TextListener listener) {
// listenerList2.remove(TextListener.class, listener);
// }
}
