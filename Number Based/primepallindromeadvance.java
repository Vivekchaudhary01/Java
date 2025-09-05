// https://leetcode.com/problems/prime-palindrome/description/
public class primepallindromeadvance {
    class Solution {
        public int primePalindrome(int n) {
            // Hardcoded because all even-digit palindromes >11 are divisible by 11
            if (n <= 11) {
                int[] base = {2, 3, 5, 7, 11};
                for (int x : base) {
                    if (x >= n) return x;
                }
            }
    
            // Only generate odd-length palindromes
            for (int len = 1; len <= 5; len++) {
                int start = (int) Math.pow(10, len - 1);   //10
                int end = (int) Math.pow(10, len);         //100    
                for (int root = start; root < end; root++) {
                    String left = Integer.toString(root);
                    String palinStr = left + new StringBuilder(left.substring(0, left.length() - 1)).reverse();
                    int candidate = Integer.parseInt(palinStr);
                    if (candidate >= n && isPrime(candidate)) {
                        return candidate;
                    }
                }
            }
            return -1; 
        }
    
        private boolean isPrime(int n) {
            if (n < 2) return false;
            if (n == 2 || n == 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        }
    }
    
}

