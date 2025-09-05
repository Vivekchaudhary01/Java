// Pascal's Triangle
// Pascal's triangle is a triangular array of the binomial coefficients.
// Each number is the sum of the two numbers directly above it.
// For example, the first 5 rows of Pascal's triangle are:
// 1
// 1 1
// 1 2 1
// 1 3 3 1  
// 1 4 6 4 1
// The nth row of Pascal's triangle corresponds to the coefficients of the binomial expansion of (a + b)^(n-1).

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();
        System.out.println("Pascal's Triangle:");
        printPascalTriangle(n);
    }
    public static void printPascalTriangle(int n) {
        int space = n-1;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // Binomial coefficient formula
            }
            System.out.println();
            space--;
        }    
    }
}
