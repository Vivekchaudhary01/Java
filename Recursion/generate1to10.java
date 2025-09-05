// WAJP to generate numbers from 1 to 10 by using recursion.

import java.util.Scanner;
public class generate1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        } else {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}
