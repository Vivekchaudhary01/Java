// WAJP to print sum of squares of numbers from 1 to 100 by using recursion.
import java.util.Scanner;
public class SumSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to calculate the sum of squares: ");
        int n = sc.nextInt();
        System.out.println("Sum of squares of numbers from 1 to " + n + " is: " + sumOfSquares(n));
    }
    public static int sumOfSquares(int n){
        if(n==1)
            return 1;
        else
            return n*n+sumOfSquares(n-1);
    }
}
