// Sequential Digits
// An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
// Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
// Example 1:
// Input: low = 100, high = 300
// Output: [123,234]
// Example 2:
// Input: low = 1000, high = 13000
// Output: [1234,2345,3456,4567,5678,6789,12345]
// Constraints:
// 10 <= low <= high <= 10^9

import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        int low = 1000;
        int high = 13000;

        List<Integer> output = sequentialDigits(low, high);
        System.out.println("Sequential digits in range: " + output);
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        for (int len = 2; len <= 9; len++) {
            for (int start = 0; start <= 9 - len; start++) {
                String sub = digits.substring(start, start + len);
                int num = Integer.parseInt(sub);
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}

