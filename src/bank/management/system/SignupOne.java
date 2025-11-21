
package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SignupOne extends JFrame {
    SignupOne(){
    
    setLayout(null);
        
    Random ran = new Random();
    long random =Math.abs((ran.nextLong()% 9000L)+1000L);
    
    JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);
    
    JLabel PersonDetails = new JLabel("Page 1: Personal Details");
    PersonDetails.setFont(new Font("Raleway",Font.BOLD,22));
    PersonDetails.setBounds(290,80,400,30);
    add(PersonDetails);
    

    JLabel name = new JLabel("Name:");
    name.setFont(new Font("Raleway",Font.BOLD,20));
    name.setBounds(100,140,100,30);
    add(name);
    
    JLabel fname = new JLabel("Father's Name:");
    fname.setFont(new Font("Raleway",Font.BOLD,20));
    fname.setBounds(100,190,200,30);
    add(fname);
    
    getContentPane().setBackground(Color.WHITE);
        
    setSize(850,800);
    setLocation(140,2);
    setVisible(true);
    }
    public static void main(String args[]){
    new SignupOne();
    }
}
