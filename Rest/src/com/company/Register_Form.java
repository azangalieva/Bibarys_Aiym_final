package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
public class Register_Form extends Container {

    private JLabel full_nameLabel;
    private JLabel usernameLabel;

    private JLabel passwordLabel;
    private JLabel retype_pLabel;
    private JLabel genderLabel;
    private JLabel phoneLabel;
    private JLabel districtLabel;
    private JTextField full_nameText;
    private JTextField usernameText;
    private JPasswordField passwordPassword;
    private  JPasswordField retype_pPassword;

    private String[] genders = {"Male", "Female"};
    private JComboBox genderBox;

    private JTextField phoneText;
    private String[] districts = {"Almaly", "Auezov","Alatau","Bostandyk","Medeu","Nauryzbai","Zhetisu","Turksib"};
    private JComboBox districtBox;

    private JButton regButton;
    private JButton backButton;


    public Register_Form(){

        setSize(700, 600);

        setLayout(null);

        full_nameLabel = new JLabel("FULLNAME: ");
        full_nameLabel.setBounds(70, 60, 100, 30);
        add(full_nameLabel);

        full_nameText = new JTextField();
        full_nameText.setBounds(150, 60, 250, 30);
        full_nameText.setForeground(new Color(228,241,254));
        full_nameText.setBackground(new Color(108,122,137));
        full_nameText.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(full_nameText);

        usernameLabel = new JLabel("USERNAME: ");
        usernameLabel.setBounds(70, 100, 100, 30);
        add(usernameLabel);

        usernameText = new JTextField();
        usernameText.setForeground(new Color(228,241,254));
        usernameText.setBackground(new Color(108,122,137));
        usernameText.setBounds(150, 100, 250, 30);
        usernameText.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(usernameText);

        passwordLabel=new JLabel("PASSWORD:");
        passwordLabel.setBounds(70, 140, 100, 30);
        add(passwordLabel);

        passwordPassword=new JPasswordField();
        passwordPassword.setBounds(150, 140, 200, 30);
        passwordPassword.setForeground(new Color(228,241,254));
        passwordPassword.setBackground(new Color(108,122,137));
        passwordPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(passwordPassword);

        retype_pLabel=new JLabel("CONFIRM A P-D");
        retype_pLabel.setForeground(new Color(255,0,51));
        retype_pLabel.setBounds(50, 180, 100, 30);
        add(retype_pLabel);

        retype_pPassword=new JPasswordField();
        retype_pPassword.setBounds(150, 180, 200, 30);
        retype_pPassword.setForeground(new Color(228,241,254));
        retype_pPassword.setBackground(new Color(108,122,137));
        retype_pPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(retype_pPassword);



        genderLabel = new JLabel("GENDER: ");
        genderLabel.setBounds(90, 220, 60, 30);
        add(genderLabel);

        genderBox = new JComboBox(genders);
        genderBox.setBounds(150, 220, 150, 30);
        genderBox.setForeground(new Color(4, 0, 2));
        genderBox.setBackground(new Color(190, 255, 209));
        add(genderBox);

        phoneLabel = new JLabel("PHONE: ");
        phoneLabel.setBounds(90, 260, 60, 30);
        add(phoneLabel);



        phoneText= new JTextField();
        phoneText.setBounds(150, 260, 250, 30);
        phoneText.setForeground(new Color(228,241,254));
        phoneText.setBackground(new Color(108,122,137));
        phoneText.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(phoneText);
        districtLabel = new JLabel("District: ");
        districtLabel .setBounds(90, 300, 60, 30);
        add(districtLabel );

        districtBox = new JComboBox(districts);
        districtBox.setBounds(150, 300, 150, 30);
        districtBox.setForeground(new Color(228,241,254));
        districtBox.setBackground(new Color(102, 200,255));
        add(districtBox);


        regButton = new JButton("REGISTRATION CLIENT");
        regButton.setBounds(90, 340, 300, 30);
        regButton.setForeground(new Color(228,241,254));
        regButton.setBackground(new Color(102,255,51));
        regButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String full_name = full_nameText.getText();
                String username = usernameText.getText();
                String password=String.valueOf(passwordPassword.getPassword());
                String retype_p=String.valueOf(retype_pPassword.getPassword());
                String gender = (String)genderBox.getSelectedItem();
                String phone = phoneText.getText();
                String district = (String)districtBox.getSelectedItem();

                Client client = new Client(null, full_name, username,password,retype_p, gender, phone,district);
                PackageData pd = new PackageData("ADD", client);
                Main.connect(pd);


                    Main.frame.foodWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);



                full_nameText.setText("");
                usernameText.setText("");
                phoneText.setText("");
            }
        });
        add(regButton);

        backButton = new JButton("BACK");
        backButton.setBounds(90, 380, 300, 30);
        backButton.setForeground(new Color(228,241,254));
        backButton.setBackground(new Color(255,51,51));
        backButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);
            }
        });


        add(backButton);




    }
}
