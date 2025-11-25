package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;

    public SignupTwo(String formno) {

        this.formno = formno;

        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBackground(Color.WHITE);
        formPanel.setPreferredSize(new Dimension(850, 850));

        JLabel additional = new JLabel("Page 2: Additional Details");
        additional.setFont(new Font("Raleway", Font.BOLD, 28));
        additional.setBounds(260, 50, 500, 40);
        formPanel.add(additional);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 200, 30);
        formPanel.add(religion);

        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        JComboBox religionBox = new JComboBox(valReligion);
        religionBox.setBackground(Color.WHITE);
        religionBox.setBounds(300, 140, 400, 30);
        formPanel.add(religionBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        formPanel.add(category);

        String[] valcategory = {"General", "OBC", "SC", "ST", "Other"};
        JComboBox categoryBox = new JComboBox(valcategory);
        categoryBox.setBackground(Color.WHITE);
        categoryBox.setBounds(300, 190, 400, 30);
        formPanel.add(categoryBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        formPanel.add(income);

        String[] incomecategory = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Above 5,00,000"};
        JComboBox incomeBox = new JComboBox(incomecategory);
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(300, 240, 400, 30);
        formPanel.add(incomeBox);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        formPanel.add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 320, 200, 30);
        formPanel.add(qualification);

        String[] educationValues = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        JComboBox educationBox = new JComboBox(educationValues);
        educationBox.setBackground(Color.WHITE);
        educationBox.setBounds(300, 310, 400, 30);
        formPanel.add(educationBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 370, 200, 30);
        formPanel.add(occupation);

        String[] occupationValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        JComboBox occupationBox = new JComboBox(occupationValues);
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(300, 370, 400, 30);
        formPanel.add(occupationBox);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 420, 200, 30);
        formPanel.add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 420, 400, 30);
        formPanel.add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 470, 200, 30);
        formPanel.add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 470, 400, 30);
        formPanel.add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 520, 200, 30);
        formPanel.add(senior);

        syes = new JRadioButton("Yes");
        syes.setBackground(Color.WHITE);
        syes.setBounds(300, 520, 100, 30);
        sno = new JRadioButton("No");
        sno.setBackground(Color.WHITE);
        sno.setBounds(450, 520, 100, 30);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        formPanel.add(syes);
        formPanel.add(sno);

        JLabel existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 570, 200, 30);
        formPanel.add(existing);

        eyes = new JRadioButton("Yes");
        eyes.setBackground(Color.WHITE);
        eyes.setBounds(300, 570, 100, 30);
        eno = new JRadioButton("No");
        eno.setBackground(Color.WHITE);
        eno.setBounds(450, 570, 100, 30);

        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(eyes);
        existGroup.add(eno);

        formPanel.add(eyes);
        formPanel.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 100, 30);
        next.addActionListener(this);
        formPanel.add(next);

        JScrollPane scrollPane = new JScrollPane(formPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane);

        setSize(850, 800);
        setLocation(140, 2);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        String senior = syes.isSelected() ? "Yes" : sno.isSelected() ? "No" : null;
        String existing = eyes.isSelected() ? "Yes" : eno.isSelected() ? "No" : null;

        try {

            if (pan.equals("")) {
                JOptionPane.showMessageDialog(null, "PAN Number is Required");
            } else if (aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
            } else if (senior == null) {
                JOptionPane.showMessageDialog(null, "Senior Citizen selection is Required");
            } else if (existing == null) {
                JOptionPane.showMessageDialog(null, "Existing Account selection is Required");
            } else {

                Conn c = new Conn();
                String query = "insert into signup2 values('" + formno + "','" + pan + "','" + aadhar + "','" + senior + "','" + existing + "')";
                c.s.executeUpdate(query);
     
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
