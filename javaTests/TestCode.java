import java.util.Scanner;

public class TestCode {
    public static void main(String[] args){
        final int RADUS = 23; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter a Number: ");
        int num2 = input.nextInt();

        System.out.println("Sum of "+num1+" and "+num2+" = "+(num1 + num2)); 
    }
} 
