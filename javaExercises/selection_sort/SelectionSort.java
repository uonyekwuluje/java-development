import java.util.*;
import java.util.concurrent.TimeUnit;

public class SelectionSort{
   public static void main(String[] args){
       int[] nums = {6,5,3,31,8,7,2,1,9,4,13,12,0};
       System.out.println("Unsorted Array => "+Arrays.toString(nums));
       sortImplement(nums);
   }

   public static void sortImplement(int[] intarg){
       try {
         for (int x = 0; x < intarg.length - 1; x++) {
           int index = x;
           for (int y = x+1; y < intarg.length; y++) {
               if (intarg[y] < intarg[index]) {
                  index = y;
               }
           } 
           int smallest = intarg[index];
           intarg[index] = intarg[x];
           intarg[x] = smallest;
           TimeUnit.SECONDS.sleep(1); 
           System.out.println("Sorted "+Arrays.toString(intarg));      
         }
       } catch (InterruptedException e) {
           System.err.format("IOException: %s%n", e);
       }
   }
}
