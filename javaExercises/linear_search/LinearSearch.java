// Linear Search
public class LinearSearch{
   public static void main(String[] args){
      int[] numArray = {12,15,7,40,23,76,22,90,87,67};
      int nfind = 5;
      System.out.println(searchNumber(numArray, nfind));
   }

   public static boolean searchNumber(int[] numarg, int nfind){
      boolean isFound = false;
      for(int x=0; x <= numarg.length-1; x++){
        if(numarg[x] == nfind){
           isFound = true;
           return isFound;
        }
      }
     return isFound;
   }
}
