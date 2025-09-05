// WAJP to generate table of a number by using recursion.

import java.util.Scanner;
public class generateTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which you want to generate the table: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n + ":");
        generateTable(n, 1);
    }
    public static void generateTable(int n, int i) {
        if(i > 10) {
            return; // Base case: stop when i exceeds 10
        }
        System.out.println(n + " x " + i + " = " + (n * i));
        generateTable(n, i + 1); // Recursive call with incremented i
    }
}