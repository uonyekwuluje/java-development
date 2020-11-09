import java.util.*;

public class LongestCommonPrefix {
   public static void main(String[] args){
      Solution newSoln = new Solution();
      //String[] strArry = {"flower","flower","flower","flower"};
      //String[] strArry = {"flower","flow","flight"};
      String[] strArry = {"aa"};
      //String[] strArry = {"flower","flow","flight","fiorena","floresence","fillabuster"};
      System.out.println(newSoln.longestCommonPrefix(strArry));
   }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
       String shortString = "";
       String longString = "";

       if (strs.length >= 200 || strs.length <= 0){
         return "";
       }

       // find longest string in array
       for (int x = 0; x <= strs.length -1; x++){
         if (strs[x].length() > longString.length()){
            longString = strs[x];
         }
       }

       if (longString.length() >= 200 || longString.length() <= 0){
         return "";
       }

       // find short test string in array
       shortString = longString;
       for (int x = 0; x <= strs.length -1; x++){
         if (strs[x].length() < shortString.length()){
            shortString = strs[x];
         }
       }

       char[] tmpChar = new char[strs.length];
       String[] tmpChar2 = new String[strs.length];
       boolean isFound = true;
       int count = 0;
       String foundString = "";
 
       for (int y = 0; y < shortString.length();y++){
         for (int xsub = 0; xsub < strs.length; xsub++){
           tmpChar[xsub] = strs[xsub].charAt(y);   
         }
         for (int ysub = 1; ysub <= tmpChar.length -1; ysub++){
           if (tmpChar[ysub] != tmpChar[ysub-1]){
             isFound = false;
             break;
           }
           foundString = String.valueOf(tmpChar[0]); 
         }

         if (isFound){
          tmpChar2[count] = foundString;
          count++;
        } 

       }
       
    return tmpChar2.toLowerCase().trim();
    }
}
