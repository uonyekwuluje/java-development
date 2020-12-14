package com.javatutorials;

import java.util.Scanner;

public class InputOutput {
    public void tinput() {
        System.out.println("Basic Java Input Output");
        System.out.println("------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("\n");

        // Getting int input
        System.out.print("Enter Integer: ");
        float myInt = input.nextInt();
        System.out.println("Integer entered = " + myInt);
        
        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
        
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
        
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        // Getting Strings input. Include next line after every input
        input.nextLine();
        System.out.print("Enter String: ");
        String myLine = input.nextLine();
        System.out.println("String Entered = " + myLine);
    }

   public void display() {
        System.out.println("Basic Output");
        System.out.println("-------------");
    }


}
