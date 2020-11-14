import java.util.*;
import java.util.concurrent.TimeUnit;

public class BinarySearch{
   public static void main(String[] args){
       int[] nums = {6,5,3,31,8,7,2,1,9,4,13,12,0};
       int searchItem = 7;
       System.out.println("Unsorted Array => "+Arrays.toString(nums));
       int[] sortedList = sortImplement(nums);
       System.out.println("Sorted Array => "+Arrays.toString(sortedList));
       if (search(sortedList,searchItem) == -1){
          System.out.println("Requested Item ["+searchItem+"] not found");
       } else {
          System.out.println("Item ["+searchItem+"] is in Index => "+search(sortedList,searchItem));
       }
   }

   // Selection Sort
   public static int[] sortImplement(int[] intarg){
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
       }
   return intarg; 
   }

   // Binary Search
   public static int search(int[] intData, int element){
       int low = 0;
       int high = intData.length - 1;

       while (low <= high) {
           int mid = low + (high - low)/2;
           if (intData[mid] == element) {
               return mid;
           }

           if (intData[mid] < element) {
               low = mid + 1;
           } else {
               high = mid - 1;
           } 
      }          
   return -1;
   }
}
