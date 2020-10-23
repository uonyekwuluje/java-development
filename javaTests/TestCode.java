import java.util.Scanner;

public class TestCode {
    public static void main(String[] args){
        double dnum = 34.90; 
        boolean tval = true;


        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter a Number: ");
        int num1 = input.nextInt();
      
        if ((int)dnum >= 50){ 
            System.out.println("Great Stuff");
        }else{
            System.out.println("Great Bad Stuff");
        }
        System.out.println("2 to the power 2 = "+Math.pow(2,2));
      
        if (tval)
          System.out.println("Well It is True");
        else
          System.out.println("Terribly Bad");*/
       
       String str = new String();
       System.out.print("Enter Full Name: ");
       str = input.nextLine();
       System.out.println("Normal :"+str);
       System.out.println("Lower :"+str.toLowerCase());
       System.out.println("Lower :"+str.toUpperCase());
       System.out.println("Lower :"+str.length());

       String message = "Welcome to Grafton Massachusetts";
       System.out.println(message.substring(0,11));

    }
} 
