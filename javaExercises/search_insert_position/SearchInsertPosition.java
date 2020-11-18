import java.util.*;

public class SearchInsertPosition {
   public static void main(String[] args){
     int[] nums = {1,3,5,6};
     int snum = 0;
     Solution newSoln = new Solution();
     System.out.println(newSoln.searchInsert(nums,snum));
   }
}

class Solution{
    public int searchInsert(int[] nums, int target) {
       int pivot, left = 0, right = nums.length - 1;
       while (left <= right) {
           pivot = left + (right - left) / 2;
           if (nums[pivot] == target) return pivot;
           if (target < nums[pivot]){ 
              right = pivot - 1;
           } else { 
              left = pivot + 1;
           }
       }
    return left;
    }
}
