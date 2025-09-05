// https://leetcode.com/problems/fibonacci-number/description/


import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:"+fibonacciSeries(n));
    }
    public static int fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
