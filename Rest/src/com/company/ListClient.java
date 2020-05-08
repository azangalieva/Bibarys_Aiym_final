package com.company;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
public class ListClient extends Container{
    public  static JTextArea text;
    private JButton buttonLIST;
    private JButton buttonBACK;

    public ListClient() {
        setSize(500,400);
        setLayout(null);

        text = new JTextArea();
        text.setBounds(90, 50, 300, 150);
        text.setFont(new Font("Verdana", Font.PLAIN, 24));
        add(text);

        buttonLIST = new JButton("LIST CLIENTS");
        buttonLIST.setBounds(90, 220, 145, 30);
        buttonLIST.setForeground(new Color(228,241,254));
        buttonLIST.setBackground(new Color(107,185,240));
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("LIST");
                Main.connect(pd);

            }
        });
        add(buttonLIST);

        buttonBACK = new JButton("BACK");
        buttonBACK.setBounds(245, 220, 145,30);
        buttonBACK.setForeground(new Color(228,241,254));
        buttonBACK.setBackground(new Color(255,51,51));
        buttonBACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.listWindow.setVisible(false);
            }
        });
        add(buttonBACK);



    }
}
