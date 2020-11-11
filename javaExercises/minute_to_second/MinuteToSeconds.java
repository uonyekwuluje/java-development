import java.util.Arrays;

public class MinuteToSeconds {
   public static void main(String[] args){
     Solution newsoln = new Solution();
     int minutes = 2;
     System.out.println(minutes+" Minutes = "+newsoln.convert(minutes)+" Seconds");
   } 
}


class Solution {
    public int convert(int minutes) {
    return minutes * 60; 
    }    
}
