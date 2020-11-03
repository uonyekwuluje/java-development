import java.util.Arrays;

public class BubbleSort{
   public static void main(String[] args){
      int[] numArray = {4,3,2,11,0,6,1,15};
      System.out.println("Unsorted Array => "+Arrays.toString(numArray));
      System.out.println("Sorted Array   => "+Arrays.toString(bubbleSort(numArray)));
   }

   public static int[] bubbleSort(int[] numArg){
      for(int x = 0; x < numArg.length - 1; x++) {
         for(int y = 0; y < numArg.length - x -1; y++) {
            if (numArg[y] > numArg[y+1]){
               int temp = numArg[y];
               numArg[y] = numArg[y+1];
               numArg[y+1] = temp;
            }
         }
      }
      return numArg;
   }

}
