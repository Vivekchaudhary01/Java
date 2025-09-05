// WAJP to generate n term of Fibonacci series by using recursion.

import java.util.Scanner;

public class generatefibonacci {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms in the Fibonacci series:");
    int n = sc.nextInt();
    System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    } 
    public static int fibonacciSeries(int n) {
          if (n <= 1) {
                return n;
          }
          return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
     }
}
