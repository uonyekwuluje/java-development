package com.tutorial.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
	        return (firstChar == lastChar) && isPalindrome(mid);
	    }
    }


    static void myMethod() {
      System.out.println("Hello World. This is Develop");
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        myMethod();
    }
}
