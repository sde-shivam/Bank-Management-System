package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;

    public SignupTwo(String formno) {
        this.formno=formno;
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBackground(Color.WHITE);
        formPanel.setPreferredSize(new Dimension(850,850));
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        formPanel.add(additionalDetails);

        JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Raleway", Font.BOLD, 20));
        sreligion.setBounds(100, 140, 200, 30);
        formPanel.add(sreligion);
        
        String valReligion[]= {"Hindu","Muslim","Sikh","Christion","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        formPanel.add(religion);
       
        JLabel scategory = new JLabel("Category:");
        scategory.setFont(new Font("Raleway", Font.BOLD, 20));
        scategory.setBounds(100, 190, 200, 30);
        formPanel.add(scategory);
        
        String valcategory[]= {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        formPanel.add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        formPanel.add(dob);
        
        String incomecategory[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        formPanel.add(income);

        JLabel seducation = new JLabel("Educational");
        seducation.setFont(new Font("Raleway", Font.BOLD, 20));
        seducation.setBounds(100, 290, 200, 30);
        formPanel.add(seducation);

        JLabel squalification = new JLabel("Qualification:");
        squalification.setFont(new Font("Raleway", Font.BOLD, 20));
        squalification.setBounds(100, 315, 200, 30);
        formPanel.add(squalification);
        
        String educationValues[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315, 400, 30);
        education.setBackground(Color.WHITE);
        formPanel.add(education);

        JLabel soccupation = new JLabel("Occupation:");
        soccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        soccupation.setBounds(100, 390, 200, 30);
        formPanel.add(soccupation);
        
        String occupationValues[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390, 400, 30);
        occupation.setBackground(Color.WHITE);
        formPanel.add(occupation);
        
        JLabel span = new JLabel("PAN Number:");
        span.setFont(new Font("Raleway", Font.BOLD, 20));
        span.setBounds(100, 440, 200, 30);
        formPanel.add(span);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        formPanel.add(pan);

        JLabel saadhar = new JLabel("Aadhar Number:");
        saadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        saadhar.setBounds(100, 490, 200, 30);
        formPanel.add(saadhar);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        formPanel.add(aadhar);

        JLabel ssenior = new JLabel("Senior citizen:");
        ssenior.setFont(new Font("Raleway", Font.BOLD, 20));
        ssenior.setBounds(100, 540, 200, 30);
        formPanel.add(ssenior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        formPanel.add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        formPanel.add(sno);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        JLabel sexisting = new JLabel("Existing Account:");
        sexisting.setFont(new Font("Raleway", Font.BOLD, 20));
        sexisting.setBounds(100, 590, 200, 30);
        formPanel.add(sexisting);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        formPanel.add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        formPanel.add(eno);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
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

    public void actionPerformed(ActionEvent ae){
       String sreligion =(String) religion.getSelectedItem();
       String scategory = (String) category.getSelectedItem();
       String sincome =(String) income.getSelectedItem();
       String seducation =(String) education.getSelectedItem();
       String soccupation =(String) occupation.getSelectedItem();
       String seniorcitizen = null;
       String existing =null;
       if(syes.isSelected()){
       seniorcitizen = "Yes";
       }else if(sno.isSelected()){
       seniorcitizen = "No";
       }
       
       String existingaccount = null;
       if(eyes.isSelected()){
       existingaccount = "Yes";
       }else if(eno.isSelected()){
       existingaccount = "No";
       }
       String span = pan.getText();
       String saadhar = aadhar.getText();
       
       try{
         if (span.equals("")) {
           JOptionPane.showMessageDialog(null, "PAN Number is Required");
           } else if (saadhar.equals("")) {
           JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
             } else if (seniorcitizen == null) {
           JOptionPane.showMessageDialog(null, "Senior Citizen selection is Required");
           } else if (existingaccount == null) {
            JOptionPane.showMessageDialog(null, "Existing Account selection is Required");
            }
            else{
           Conn c = new Conn();
           String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
           c.s.executeUpdate(query);
          
           setVisible(false);
           new SignupThree(formno).setVisible(true);
          }
       }catch(Exception e){
        System.out.println(e);
       }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
