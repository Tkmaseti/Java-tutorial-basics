// package com.company;

// import javax.swing.JOptionPane;

import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        System.out.println("Welcome To My Game");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Place: ");
        String place = scanner.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Age: ");
        String age = scanner.nextLine() ;
        Integer ages = Integer.parseInt(age);

        // System.out.println("Hello " + name + " " + surname + " from " + place);
        if (ages >= 18){
            System.out.println("Welcome " + name);
            System.out.println("Would You Like to play a game press 'start' to play");

            Scanner scanner4 = new Scanner(System.in);
            System.out.print("> ");
            String command = scanner.nextLine() ;
            if (command.toLowerCase() == "start".toLowerCase()){
                System.out.println("You have Started th game T/D" + command);
            }
            else {
                System.out.println("Sorry i dont follow");
            }

        }
        else{
            System.out.println("Sorry you are young to play this game");
        }
    }
}
