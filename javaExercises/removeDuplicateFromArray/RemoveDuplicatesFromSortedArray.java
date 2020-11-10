public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        //int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution newSoln = new Solution();
        newSoln.removeDuplicates(nums);
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        for (int x = 0; x<= nums.length - 1; x++){
           System.out.println("The Lenght of the Integer => "+nums[x]);
        } 
        return 1;
    }
}
