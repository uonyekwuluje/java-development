import java.util.*;

public class LongestCommonPrefix {
   public static void main(String[] args){
      Solution newSoln = new Solution();
      //String[] strArry = {"flower","flower","flower","flower"};
      String[] strArry = {"flower","flow","flight"};
      //String[] strArry = {"aa"};
      //String[] strArry = {"flower","flow","flight","fiorena","floresence","fillabuster"};
      System.out.println("Array => "+Arrays.toString(strArry));
      System.out.println("LongestPrefix => "+newSoln.longestCommonPrefix(strArry));
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

       boolean isFound = false;
       String newString = "";
       String currString = "";

      newString = currString;
      //System.out.println("Longest String in Array => "+longString);
      //System.out.println("Shortest String in Array => "+shortString);
      for (int x = 0; x <= shortString.length()-1; x++) {
         currString = shortString.substring(0,x+1);
         //System.out.println("String Index => "+currString);
         for (int y=0; y <=strs.length -1; y++){ 
            String ts = strs[y].substring(0,x+1);
            //System.out.println("DEBUG Index "+strs[y].substring(0,x+1));
            //if (currString != strs[y].substring(0,x+1)){
                 System.out.println(currString+" == "+strs[y].substring(0,x+1)+" => "+(currString == ts));
                 //isFound = true;
                 //break;
            //}
         }
         if (isFound){
           return newString;
         }else{
           newString = currString;
         }
         isFound = false;
      }
    return newString;
    }
}
