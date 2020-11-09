public class TestStrings{
   public static void main(String[] args){
       char[] arrSample = {'T','O','N','y'};
       String nstring = new String(arrSample);
       String str1 = "Natasha";
       String str2 = "Romanov";
       System.out.println(arrSample[0]);
       System.out.println(nstring);
       concatstring(str1,str2);
       indexstring(str1,str2);
       casestring(str1);
       testsubstring(str2);
   }

   public static void concatstring(String ar1, String ar2){
       System.out.println("Testing String Concatenation\n----------------------------");
       String ar3 = ar1 + ar2;
       String ar4 = ar1.concat(ar2);
       System.out.println("Full name => "+ar3);
       System.out.println("Lenght of String => "+ar4.length());
   }


   public static void indexstring(String ar1, String ar2){
       System.out.println("\nTesting String Index\n----------------------------");
       String ar3 = ar1 + ar2;
       String ar4 = ar1.concat(ar2);
       System.out.println("Full name => "+ar3.charAt(5));
       System.out.println("Lenght of String => "+ar4.indexOf('R'));
   }

   public static void casestring(String ar1){
       System.out.println("\nTesting Case String\n----------------------------");
       System.out.println("Upper Case => "+ar1.toUpperCase());
       System.out.println("Lower Case => "+ar1.toLowerCase());
   }

   public static void testsubstring(String ar1){
       System.out.println("\nTesting SubString\n----------------------------");
       System.out.println("Substring => "+ar1.substring(2,4));
   }



}
