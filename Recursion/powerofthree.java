// https://leetcode.com/problems/power-of-three/description/		

import java.util.Scanner;

public class powerofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a power of three:");
        int n = sc.nextInt();
        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is not a power of three.");
        }
    }
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
