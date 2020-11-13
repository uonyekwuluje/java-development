import java.util.*;
import java.util.concurrent.TimeUnit;

public class SmallestLargest{
   public static void main(String[] args){
       int[] nums = {6,5,3,11,8,7,2,1,9,4,13,-3,12,0};
       System.out.println("=> "+Arrays.toString(nums));
       //smallest1(nums);
       smallest2(nums);
   }


   public static void smallest1(int[] intarg){
       int temp = 0;
       for (int x = 0; x < intarg.length; x++) {
         for (int y = x+1; y < intarg.length; y++) {
            if (intarg[x] > intarg[y]) {
               temp = intarg[x];
               intarg[x] = intarg[y];
               intarg[y] = temp;
            }
         }
       }
       System.out.println("The Smallest value "+intarg[0]);
   }


   public static void smallest2(int[] intarg){
       int smallest = 0;
       int largest = 0;
       for (int x = 0; x < intarg.length; x++) {
           if (intarg[x] < smallest) {
             smallest = intarg[x];
           } else if (intarg[x] > largest){  
             largest = intarg[x];
           }      
       }
       System.out.println("The Smallest value "+smallest);
       System.out.println("The Largest value "+largest);
   }
}
