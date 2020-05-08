package com.company;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
public class Food extends Container{
    private JLabel drinkLabel;
    private JLabel fastfoodLabel;
    private JLabel orderLabel;
    private String[] drinks = {"Coca-cola", "Juice","Alcohol"};
    private String[] fastfoods = {"Pizza", "Burgers","Snacks","Sandwich"};
    private JComboBox drinkBox;

    private JComboBox fastfoodBox;
    private JCheckBox orderBox;
    private JButton payButton;
    private JButton backButton;
    public  static JTextArea text;
    private  JLabel addressLabel;





    public Food(){
        setSize(700, 600);

        setLayout(null);
        fastfoodLabel = new JLabel("Fastfood: ");
        fastfoodLabel.setBounds(90, 80, 90, 30);
        fastfoodLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(fastfoodLabel);

        fastfoodBox = new JComboBox(fastfoods);
        fastfoodBox.setBounds(170, 80, 150, 30);
        fastfoodBox.setForeground(new Color(4, 0, 2));
        fastfoodBox.setBackground(new Color(197, 180, 255));
        add(fastfoodBox);

        drinkLabel = new JLabel("Drinks: ");
        drinkLabel.setBounds(90, 120, 60, 30);
        drinkLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(drinkLabel);

        drinkBox = new JComboBox(drinks);
        drinkBox.setBounds(170, 120, 150, 30);
        drinkBox.setForeground(new Color(4, 0, 2));
        drinkBox.setBackground(new Color(190, 255, 209));
        add(drinkBox);

        orderLabel = new JLabel("Order at home: ");
        orderLabel.setBounds(60, 160, 140, 30);
        orderLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(orderLabel);

        orderBox = new JCheckBox();
        orderBox.setBounds(170, 160, 20, 30);
        orderBox.setForeground(new Color(4, 0, 2));
        orderBox.setBackground(new Color(255, 0, 23));
        add(orderBox);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(40, 200, 90, 30);
        addressLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        add(addressLabel);
        text = new JTextArea();
        text.setBounds(120, 200, 200, 110);
        text.setFont(new Font("Verdana", Font.PLAIN, 16));
        add(text);

        payButton = new JButton("PAY");
        payButton.setBounds(90, 340, 300, 30);
        payButton.setForeground(new Color(228,241,254));
        payButton.setBackground(new Color(255, 166, 8));
        payButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.foodWindow.setVisible(false);
            }
        });
        add(payButton);

        backButton = new JButton("BACK");
        backButton.setBounds(90, 380, 300, 30);
        backButton.setForeground(new Color(228,241,254));
        backButton.setBackground(new Color(255,51,51));
        backButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.foodWindow.setVisible(false);
            }
        });


        add(backButton);

    }
}
