import java.util.Arrays;

public class SumOfTwo {
   public static void main(String[] args){
     Solution newsoln = new Solution();
     int[] numsArray = {3,3};
     int target = 6;

     System.out.println(Arrays.toString(newsoln.twoSum(numsArray, target)));
   } 
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] returnValue = {0,0};
       int count = 1;
       while (count <= nums.length - 1){
        for (int x = count; x <= nums.length - 1; x++) {
            //System.out.println("Previous => "+ nums[count -1] + " Current => "+ nums[count]);
            //System.out.println(nums[count-1]+" + "+nums[x]+ " = "+(nums[count-1]+nums[x]));
            if ((nums[count-1] + nums[x]) == target){
                //System.out.println("["+(count-1)+","+x+"]");
                returnValue[0] = count-1;
                returnValue[1] = x;
                return returnValue;
            }
        }
        count++;
       }
    return returnValue; 
    }    
}
