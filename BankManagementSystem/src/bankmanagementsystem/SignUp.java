package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUp extends JFrame implements ActionListener {

    long applicationformno;
    JTextField tfname, tffathername, tfemailaddress, tfaddress, tfcity, tfpincode, tfstate;
    JButton next;
    JDateChooser ddateofbirth;
    JRadioButton rbmale, rbfemale, rbmarried, rbunmarried, rbother;

    public SignUp() {
        Random ran = new Random();
        applicationformno = Math.abs(ran.nextLong() % 9000L) + 1000L;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("APPLICATION FORM NO. " + applicationformno);
        heading.setBounds(150, 30, 600, 40);
        heading.setFont(new Font("Dialog", Font.BOLD, 34));
        heading.setForeground(Color.BLUE);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 0, 90, 90);
        add(image);

        JLabel subheading = new JLabel("Page 1: Personal Details");
        subheading.setBounds(200, 100, 400, 40);
        subheading.setFont(new Font("Dialog", Font.BOLD, 28));
        add(subheading);

        JLabel name = new JLabel("Name:");
        name.setBounds(50, 170, 150, 30);
        name.setFont(new Font("Dialog", Font.BOLD, 20));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(230, 170, 450, 30);
        add(tfname);

        JLabel fathername = new JLabel("Father Name:");
        fathername.setBounds(50, 220, 150, 30);
        fathername.setFont(new Font("Dialog", Font.BOLD, 20));
        add(fathername);

        tffathername = new JTextField();
        tffathername.setBounds(230, 220, 450, 30);
        add(tffathername);

        JLabel dateofbirth = new JLabel("Date of Birth:");
        dateofbirth.setBounds(50, 270, 150, 30);
        dateofbirth.setFont(new Font("Dialog", Font.BOLD, 20));
        add(dateofbirth);

        ddateofbirth = new JDateChooser();
        ddateofbirth.setBounds(230, 270, 450, 30);
        ddateofbirth.setForeground(new Color(105, 105, 105));
        add(ddateofbirth);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(50, 320, 150, 30);
        gender.setFont(new Font("Dialog", Font.BOLD, 20));
        add(gender);

        ButtonGroup genderGroup = new ButtonGroup();
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(230, 320, 150, 30);
        rbmale.setBackground(Color.WHITE);
        rbmale.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(rbmale);
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(380, 320, 150, 30);
        rbfemale.setBackground(Color.WHITE);
        rbfemale.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(rbfemale);
        genderGroup.add(rbmale);
        genderGroup.add(rbfemale);

        JLabel emailaddress = new JLabel("Email Address:");
        emailaddress.setBounds(50, 370, 150, 30);
        emailaddress.setFont(new Font("Dialog", Font.BOLD, 20));
        add(emailaddress);

        tfemailaddress = new JTextField();
        tfemailaddress.setBounds(230, 370, 450, 30);
        add(tfemailaddress);

        JLabel martialstatus = new JLabel("Martial Status:");
        martialstatus.setBounds(50, 420, 150, 30);
        martialstatus.setFont(new Font("Dialog", Font.BOLD, 20));
        add(martialstatus);

        ButtonGroup martialstatusgroup = new ButtonGroup();
        rbmarried = new JRadioButton("Married");
        rbmarried.setBounds(230, 420, 150, 30);
        rbmarried.setBackground(Color.WHITE);
        rbmarried.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(rbmarried);
        rbunmarried = new JRadioButton("UnMarried");
        rbunmarried.setBounds(380, 420, 150, 30);
        rbunmarried.setBackground(Color.WHITE);
        rbunmarried.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(rbunmarried);
        rbother = new JRadioButton("Other");
        rbother.setBounds(530, 420, 150, 30);
        rbother.setBackground(Color.WHITE);
        rbother.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(rbother);
        martialstatusgroup.add(rbmarried);
        martialstatusgroup.add(rbunmarried);
        martialstatusgroup.add(rbother);

        JLabel address = new JLabel("Address:");
        address.setBounds(50, 470, 150, 30);
        address.setFont(new Font("Dialog", Font.BOLD, 20));
        add(address);

        tfaddress = new JTextField();
        tfaddress.setBounds(230, 470, 450, 30);
        add(tfaddress);

        JLabel city = new JLabel("City:");
        city.setBounds(50, 520, 150, 30);
        city.setFont(new Font("Dialog", Font.BOLD, 20));
        add(city);

        tfcity = new JTextField();
        tfcity.setBounds(230, 520, 450, 30);
        add(tfcity);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setBounds(50, 570, 150, 30);
        pincode.setFont(new Font("Dialog", Font.BOLD, 20));
        add(pincode);

        tfpincode = new JTextField();
        tfpincode.setBounds(230, 570, 450, 30);
        add(tfpincode);

        JLabel state = new JLabel("State:");
        state.setBounds(50, 620, 150, 30);
        state.setFont(new Font("Dialog", Font.BOLD, 20));
        add(state);

        tfstate = new JTextField();
        tfstate.setBounds(230, 620, 450, 30);
        add(tfstate);

        next = new JButton("Next");
        next.setBounds(530, 670, 150, 30);
        next.setFont(new Font("Dialog", Font.BOLD, 16));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        setSize(800, 800);
        setLocation(250, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + applicationformno;
        String name = tfname.getText();
        String fathername = tffathername.getText();
        String dateofbirth = ((JTextField) ddateofbirth.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (rbmale.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String emailaddress = tfemailaddress.getText();
        String martialstatus = null;
        if (rbmarried.isSelected()) {
            martialstatus = "Married";
        } else if (rbunmarried.isSelected()) {
            martialstatus = "UnMarried";
        } else {
            martialstatus = "Other";
        }
        String address = tfaddress.getText();
        String city = tfcity.getText();
        String pincode = tfpincode.getText();
        String state = tfstate.getText();
        if (ae.getSource() == next) {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name not Entered");
            } else if (fathername.equals("")) {
                JOptionPane.showMessageDialog(null, "Father Name not Entered");
            } else if (dateofbirth.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of Birth not Entered");
            } else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Gender not Entered");
            } else if (emailaddress.equals("")) {
                JOptionPane.showMessageDialog(null, "Email Address not Entered");
            } else if (martialstatus.equals("")) {
                JOptionPane.showMessageDialog(null, "Martial Status not Entered");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address not Entered");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City not Entered");
            } else if (pincode.equals("")) {
                JOptionPane.showMessageDialog(null, "PIN code not Entered");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "S not Entered");
            } else {
                try {
                    Conn c = new Conn();
                    String query = "insert into personaldetails values('"
                            + formno + "','"
                            + name + "','"
                            + fathername + "','"
                            + dateofbirth + "','"
                            + gender + "','"
                            + emailaddress + "','"
                            + martialstatus + "','"
                            + address + "','"
                            + city + "','"
                            + pincode + "','"
                            + state + "')";
                    c.s.executeUpdate(query);
                    new AdditionalDetails(formno);
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }

}
