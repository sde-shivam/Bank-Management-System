
package bank.management.system;
import java.awt.*;
import javax.swing.*;

public class PinChange extends JFrame {
      PinChange(String pinchange){
        setLayout(null); 
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,-100,900,900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("system",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
        JTextField pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("system",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        JTextField repin = new JTextField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);
        
        setSize(900, 900);
        setLocation(100,0);
        //setUndecorated(true);
        setVisible(true);
   } 
    
    public static void main(String args[]){
      new PinChange("").setVisible(true);
    }
}
