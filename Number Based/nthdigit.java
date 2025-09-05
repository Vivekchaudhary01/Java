// Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
// Example 1:
// Input: n = 3
// Output: 3

// Example 2:
// Input: n = 11
// Output: 0
// Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.

import java.util.*;
public class nthdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position n: ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th digit in the sequence is: " + findNthDigit(n));
    }
    public static int findNthDigit(int n) {
        int digitLength = 1; // Length of the digits (1 for 1-9, 2 for 10-99, etc.)
        long count = 9; // Count of numbers with the current digit length
        long start = 1; // Starting number for the current digit length

        // Find the range where the nth digit falls
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10; // Increase count to the next range (9, 90, 900, ...)
            start *= 10; // Increase start to the next range (1, 10, 100, ...)
        }

        // Find the actual number that contains the nth digit
        long num = start + (n - 1) / digitLength;
        String numStr = Long.toString(num);
        
        // Find the specific digit in that number
        return Character.getNumericValue(numStr.charAt((n - 1) % digitLength));
    }
}
