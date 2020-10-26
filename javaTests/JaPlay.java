import java.util.Scanner;

public class JaPlay {
   public static void main(String[] args){
      Scanner tinput = new Scanner(System.in);

      String fullName = "Uchechukwu Onyekwuluje";
      int[][] newt = {{2,3},{6,1},{8,4}};
      for (int row = 0; row <= newt.length - 1; row++){
         for (int col = 0; col <= newt[0].length -1; col++){
              System.out.print(newt[row][col]);
          }
          System.out.println("");
      }
   }
}
