package com.javaconcepts.app;

public class Intro 
{
    public static void main(String[] args)
    {
        PrintDisplay display = new PrintDisplay();
        TextInput testinput = new TextInput();
        System.out.println("HelloWorld and java Concepts");
        System.out.println("============================="); 
        display.displayName();      
        testinput.codeInput();  
    }
}
