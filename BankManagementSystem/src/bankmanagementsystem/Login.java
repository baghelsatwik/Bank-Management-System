package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField tfcardno;
    JPasswordField tfpin;
    JButton signup, signin, clear;

    public Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("WELCOME TO ATM");
        heading.setBounds(180, 25, 400, 40);
        heading.setFont(new Font("Dialog", Font.BOLD, 36));
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(80, 0, 90, 90);
        add(image);

        JLabel cardno = new JLabel("Card No:");
        cardno.setBounds(120, 120, 100, 30);
        cardno.setFont(new Font("Dialog", Font.BOLD, 24));
        add(cardno);

        tfcardno = new JTextField();
        tfcardno.setBounds(270, 120, 200, 30);
        tfcardno.setFont(new Font("Arial", Font.BOLD, 20));
        add(tfcardno);

        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 190, 100, 30);
        pin.setFont(new Font("Dialog", Font.BOLD, 24));
        add(pin);

        tfpin = new JPasswordField();
        tfpin.setBounds(270, 190, 200, 30);
        add(tfpin);

        signin = new JButton("SIGN IN");
        signin.setBounds(270, 270, 90, 30);
        signin.setForeground(Color.WHITE);
        signin.setBackground(Color.BLACK);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setBounds(380, 270, 90, 30);
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(270, 320, 200, 30);
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        setSize(700, 450);
        setLocation(350, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            tfcardno.setText("");
            tfpin.setText("");
        } else if (ae.getSource() == signin) {
            String cardno = tfcardno.getText();
            String pin = tfpin.getText();

            try {
                Conn c = new Conn();

                String query = "select * from login where cardno = '" + cardno + "' and pin = '" + pin + "'";

                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pin).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignUp().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
