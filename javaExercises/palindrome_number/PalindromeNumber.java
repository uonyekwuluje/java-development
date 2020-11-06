// https://coderscat.com/leetcode-palindrome-number
// https://www.programiz.com/java-programming/examples/palindrome-number
public class PalindromeNumber{
    public static void main(String[] args){
       int num = -121;
       Solution palindromeCheck = new Solution();
       System.out.println("Integer => "+num+" Palindrome => "+palindromeCheck.isPalindrome(num));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0) {
        return false;
      }
      int n = x;
      int rev = 0;
      while (n > 0) {
        int t = n % 10;
        if(rev >= Integer.MAX_VALUE/10 + n%10)
         return false;
        rev = 10 * rev + t;
        n /= 10;
      }
      return rev == x;
    }
}
