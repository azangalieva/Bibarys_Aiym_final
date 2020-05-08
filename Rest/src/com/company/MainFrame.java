package com.company;
import javax.swing.*;
import java.awt.*;



public class MainFrame extends JFrame{
    public static MainMenu menuWindow;
    public static Register_Form addWindow;
    public static ListClient listWindow;
    public static Food foodWindow;



    public MainFrame(){


        setSize(500, 600);

        this.setLocationRelativeTo(null);
        setTitle("Restaurant Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow = new MainMenu();
        menuWindow.setLocation(0,0);

        add(menuWindow);

        addWindow = new Register_Form();
        addWindow.setLocation(0, 0);
        addWindow.setVisible(false);
        add(addWindow);

        listWindow = new ListClient();
        listWindow.setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        foodWindow = new Food();
        foodWindow.setLocation(0,0);
        foodWindow.setVisible(false);
        add(foodWindow);




    }
}
