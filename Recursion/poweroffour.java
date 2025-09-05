// https://leetcode.com/problems/power-of-four/description/	

import java.util.Scanner;

public class poweroffour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a power of four:");
        int n = sc.nextInt();
        if (isPowerOfFour(n)) {
            System.out.println(n + " is a power of four.");
        } else {
            System.out.println(n + " is not a power of four.");
        }
    }   
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    } 
}
