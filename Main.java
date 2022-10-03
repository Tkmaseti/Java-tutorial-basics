// package com.company;

import javax.swing.JOptionPane;

// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String surname = JOptionPane.showInputDialog("Enter your surname");
        // JOptionPane.showMessageDialog(null, "Welcome " + name + " " + surname);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOptionPane.showMessageDialog(null, age);
        if(age<=18){
            JOptionPane.showMessageDialog(null, "Sorry you are young to enter");
        }
        else if (age >= 18){
            JOptionPane.showMessageDialog(null, "Welcome");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry " + name + " I do not understand");
        }
    }
}
