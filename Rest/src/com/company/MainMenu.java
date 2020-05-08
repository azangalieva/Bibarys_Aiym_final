package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
public class MainMenu extends Container{
    private JButton regButton;
    private JButton listButton;
    private JButton exitButton;
    private JButton foodButton;
    private JLabel welcomeLabel;



    public MainMenu(){

        setSize(800, 600);

        setLayout(null);
        welcomeLabel = new JLabel("WELCOME to our RESTAURANT ");
        welcomeLabel.setBounds(70, 80, 400, 50);
        welcomeLabel.setForeground(new Color(255, 90, 251));
        welcomeLabel.setBackground(new Color(6, 12, 3));
        welcomeLabel.setFont(new Font("Verdana", Font.PLAIN, 25));

        add(welcomeLabel);

        regButton = new JButton("REGISTRATION");
        regButton.setBounds(100, 150, 300, 50);
        regButton.setBackground(new Color(102,255,51));
        regButton.setForeground(new Color(255,255,255));
        regButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });
        add(regButton);

        listButton = new JButton("LIST");
        listButton.setBounds(100, 220, 300, 50);
        listButton.setBackground(new Color(107,185,240));
        listButton.setForeground(new Color(255,255,255));
        listButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.listWindow.setVisible(true);

            }
        });
        add(listButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(100, 290, 300, 50);
        exitButton.setBackground(new Color(255,0,51));
        exitButton.setForeground(new Color(255,255,255));
        exitButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        foodButton = new JButton("MENU");
        foodButton.setBounds(100, 360, 300, 50);
        foodButton.setBackground(new Color(240, 204, 27));
        foodButton.setForeground(new Color(255,255,255));
        foodButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.foodWindow.setVisible(true);

            }
        });
        add(foodButton);



    }
}
