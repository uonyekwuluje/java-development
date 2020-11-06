// Word Frequency Count
/*
https://beginnersbook.com/2014/07/check-key-value-existence-in-hashtable-example-java/
https://beginnersbook.com/2019/04/java-char-to-string-conversion/
https://www.geeksforgeeks.org/hashtable-in-java/
https://www.geeksforgeeks.org/hashtable-containskey-method-in-java/
https://www.geeksforgeeks.org/convert-a-string-to-character-array-in-java/
https://www.geeksforgeeks.org/java-util-dictionary-class-java/
*/

import java.util.*; 

public class DictionaryTest { 

    public static void main(String[] args){ 
  
        // Creating an empty Hashtable 
        Hashtable<String, Integer> wordFreq = new Hashtable<String, Integer>();
     
        String testString = "This is a very good Day";
        int strLen = testString.length();

        for (int x = 0; x <= strLen -1; x++) {
          if (wordFreq.containsKey(String.valueOf(testString.charAt(x)))){
             int count = wordFreq.get(String.valueOf(testString.charAt(x)));
             count += 1;
             wordFreq.put(String.valueOf(testString.charAt(x)), count);
          } else {
             wordFreq.put(String.valueOf(testString.charAt(x)), 1);
          } 
        }

       // Display Frequency Map
       System.out.println(testString);
       for (String key : wordFreq.keySet()) {
          System.out.println(key + ":" + wordFreq.get(key));
       }   

    } 
} 
