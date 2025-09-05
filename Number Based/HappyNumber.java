// ! Happy Number

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.
// https://leetcode.com/problems/happy-number/

import java.util.Scanner;
 
public class HappyNumber {
    public static void mmain(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n){
        while(n>9){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        return n==1||n==7;
    }
    
}
