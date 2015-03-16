
import frameclass.AddComp;
import frameclass.TextPrompt;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MemberRoot extends JFrame {

    private JPanel thePanel;
    private JLabel nameL, emailL, passL, phoneL, bdLabel, ageLabel, blank;
    private JTextField fnameF, lnameF, emailF, phoneF;
    private JPasswordField passPF;
    private AddComp ac = new AddComp();
    private TextPrompt tp;
    private JRadioButton mRadio, fRadio, daRadio;
    private JComboBox bdList;
    private JSlider ageSlider;
    private JCheckBox weeklyAd, bDayClub, monthSweep;
    private Box genBox, optionBox;
    private ButtonGroup genGroup;

    public MemberRoot() {

        setTitle("Membership Registration");
// setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        thePanel = new JPanel();
        thePanel.setBorder(BorderFactory.createTitledBorder("Personal Info"));
        thePanel.setLayout(new GridBagLayout());
        add(thePanel);
        nameL = new JLabel(" What should we call you?");
        ac.addComp(thePanel, nameL, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        Box fBox = Box.createHorizontalBox();
        fnameF = new JTextField(15);
        tp = new TextPrompt("First Name", fnameF);
        fBox.add(fnameF);
        lnameF = new JTextField(15);
        tp = new TextPrompt("Last Name", lnameF);
        fBox.add(lnameF);
        ac.addComp(thePanel, fBox, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        emailL = new JLabel(" Username:");
        ac.addComp(thePanel, emailL, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        emailF = new JTextField(30);
        tp = new TextPrompt("Email", emailF);
        ac.addComp(thePanel, emailF, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        passL = new JLabel(" Password:");
        ac.addComp(thePanel, passL, 0, 2, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        passPF = new JPasswordField(30);
        ac.addComp(thePanel, passPF, 1, 2, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        passL = new JLabel(" Confirm Password:");
        ac.addComp(thePanel, passL, 0, 3, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        passPF = new JPasswordField(30);
        tp = new TextPrompt("Retype your Password", passPF);
        ac.addComp(thePanel, passPF, 1, 3, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        phoneL = new JLabel(" Phone Number:");
        ac.addComp(thePanel, phoneL, 0, 4, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        phoneF = new JTextField(30);
        tp = new TextPrompt("(XXX)XXX-XXXX", phoneF);

        ac.addComp(thePanel, phoneF, 1, 4, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        genBox = Box.createVerticalBox();
        mRadio = new JRadioButton("Male");
        fRadio = new JRadioButton("Female");
        daRadio = new JRadioButton("Decline to Answer");
        genGroup = new ButtonGroup();
        genGroup.add(mRadio);
        genGroup.add(fRadio);
        genGroup.add(daRadio);
        genBox.add(mRadio);
        genBox.add(fRadio);
        genBox.add(daRadio);
        genBox.setBorder(BorderFactory.createTitledBorder("Gender"));
        ac.addComp(thePanel, genBox, 3, 0, 2, 4, GridBagConstraints.WEST, GridBagConstraints.NONE);
        blank = new JLabel(" ");
        ac.addComp(thePanel, blank, 1, 5, 2, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JPanel bdPanel = new JPanel();
        bdPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        bdLabel = new JLabel(" Birthday Month");
        bdPanel.add(bdLabel);
        String[] bDay = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        bdList = new JComboBox(bDay);
        bdPanel.add(bdList);
        ageLabel = new JLabel("Age: 50");
        bdPanel.add(ageLabel);
        ageSlider = new JSlider(1, 99, 50);
        ListenForSlider lForSlider = new ListenForSlider();
        ageSlider.addChangeListener(lForSlider);
        bdPanel.add(ageSlider);
        ac.addComp(thePanel, bdPanel, 0, 6, 4, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        blank = new JLabel(" ");
        ac.addComp(thePanel, blank, 0, 7, 2, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        Box optionBox = Box.createVerticalBox();
        weeklyAd = new JCheckBox("Sign up for our weekly ad, exclusive offers and more.");
        bDayClub = new JCheckBox("Sign up for our Birthday Club");
// monthSweep = new JCheckBox("Sign up for our Monthly Sweepstakes");
        optionBox.add(weeklyAd);
        optionBox.add(bDayClub);
        // optionBox.add(monthSweep);

        ac.addComp(thePanel, optionBox, 1, 8, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        JButton submit = new JButton("Submit");
        ListenForButton lForButton = new ListenForButton();
        submit.addActionListener(lForButton);
        ac.addComp(thePanel, submit, 1, 10, 2, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        blank = new JLabel(" ");
        ac.addComp(thePanel, blank, 0, 11, 2, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        this.pack();
    }

    private class ListenForSlider implements ChangeListener {

        public void stateChanged(ChangeEvent e) {
            if (e.getSource() == ageSlider) {
                ageLabel.setText("Age: " + ageSlider.getValue());
            }
        }
    }

    private class ListenForButton implements ActionListener {

        private Object outputString = "";
        private String gentext = "";
        private String text = "No Subscription";

        public void actionPerformed(ActionEvent e) {
            if ((weeklyAd.isSelected() && bDayClub.isSelected())) {
                text = (weeklyAd.getText() + "\n " + bDayClub.getText());
            } else if (weeklyAd.isSelected()) {
                text = weeklyAd.getText();
            } else if (bDayClub.isSelected()) {
                text = bDayClub.getText();
            } else if (!weeklyAd.isSelected() || !bDayClub.isSelected()) {
                text = "No Subscription";
            }
            if (mRadio.isSelected()) {
                gentext = mRadio.getText();
            } else if (fRadio.isSelected()) {
                gentext = fRadio.getText();
            } else if (daRadio.isSelected()) {
                gentext = daRadio.getText();
            }
            outputString += "Name: " + fnameF.getText() + " " + lnameF.getText() + "\n";
            outputString += "Username: " + emailF.getText() + "\n";
            outputString += "Password: " + passPF.getText() + "\n";

            outputString += "Phone Number: " + phoneF.getText() + "\n";
            outputString += "Gender: " + gentext + "\n";
            outputString += "Birthday Month: " + bdList.getSelectedItem() + "\n";
            outputString += "Age: " + ageSlider.getValue() + "\n";
            outputString += "Email Subscription: " + text + "\n";
            JOptionPane.showMessageDialog(MemberRoot.this, outputString, "Membership Info", JOptionPane.INFORMATION_MESSAGE);
            outputString = "";
        }
    }
}
