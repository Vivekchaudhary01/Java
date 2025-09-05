// WAJP to print sum of numbers from 1 to 100 by using recursion.

import java.util.Scanner;

public class sumofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to calculate the sum: ");
        int n = sc.nextInt();   
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum(n));
    }
    public static int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
}
