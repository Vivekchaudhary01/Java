// Number of Even and Odd Bits

// You are given a positive in teger n.
// Let even denote the number of even indices in the binary representation of n with value 1.
// Let odd denote the number of odd indices in the binary representation of n with value 1.
// Note that bits are indexed from right to left in the binary representation of a number.
// Return the array [even, odd].
// Example 1:
// Input: n = 50
// Output: [1,2]
// Explanation:
// The binary representation of 50 is 110010.
// It contains 1 on indices 1, 4, and 5.
// Example 2:
// Input: n = 2
// Output: [0,1]
// Explanation:
// The binary representation of 2 is 10.
// It contains 1 only on index 1.

import java.util.Scanner;

public class EvenandOddBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int bits[]=EvenandOddBits(n);    
        for(int i:bits)
            System.out.print(i+" ,");
    }  
    public static int[] EvenandOddBits(int n){
        int even = 0, odd = 0;
        int idx = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (idx % 2 == 0)
                    even++;
                else 
                    odd++;
            }
            n >>= 1;
            idx++;
        }
        return new int[]{even, odd};
    }      
}
