//https://www.programiz.com/java-programming/examples/reverse-number
//https://www.programcreek.com/2012/12/leetcode-reverse-integer/
//https://stackoverflow.com/questions/21070506/reverse-integer-leetcode-how-to-handle-overflow
import java.util.Arrays;

public class ReverseInteger{
    public static void main(String[] args){
       int num = -120;
       System.out.println("Integer => "+num);
       System.out.println("Interger Reverse One => "+reverseInteger1(num));
       System.out.println("Interger Reverse Two => "+reverseInteger2(num));
    }

    public static int reverseInteger1(int numarg){
       int reversed = 0;

        while(numarg != 0) {
            int digit = numarg % 10;
            reversed = reversed * 10 + digit;
            numarg /= 10;
        }
       return reversed;
    }


    public static int reverseInteger2(int numarg){
      int y = 0;
      while(numarg != 0) {
        int yy = y*10 + numarg%10;

        if ((yy - numarg%10)/10 != y) return 0;
        else y = yy;

        numarg = numarg/10;   
      }
    return y; 
    }


}
