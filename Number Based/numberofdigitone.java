// Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
// For example, given n = 13, return 6, because digit 1 occurs in the following numbers: 1, 10, 11, 12, and 13.
import java.util.Scanner;
public class numberofdigitone {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer n: ");
        int n = sc.nextInt();
        int count = countDigitOne(n);
        System.out.println("Total number of digit 1 appearing in all non-negative integers less than or equal to " + n + " is: " + count);
   } 

    // Optimized countDigitOne method
    public static int countDigitOne(int n) {
        if (n < 0) return 0;
        int count = 0;
        for (long factor = 1; factor <= n; factor *= 10) {
            long lower = n % factor;
            long curr = (n / factor) % 10;
            long higher = n / (factor * 10);

            if (curr == 0) {
                count += higher * factor;
            } else if (curr == 1) {
                count += higher * factor + lower + 1;
            } else {
                count += (higher + 1) * factor;
            }
        }
        return count;
    }
}

// 35 se karna hai

