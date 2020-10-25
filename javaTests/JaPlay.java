import java.util.Scanner;

public class JaPlay {
   public static void main(String[] args){
      Scanner tinput = new Scanner(System.in);

      String fullName = "Uchechukwu Onyekwuluje";
      char[] fName = new char[fullName.length()];

      System.out.println(fullName); 
      System.out.println(fullName.length()); 
      for (int x = 0; x<=fullName.length()-1; x++) 
          fName[x] = fullName.charAt(x);

      for (char e: fName){
         System.out.println(e);
      }
   }
}
