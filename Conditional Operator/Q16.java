//WAJP to print the bigger of two numbers.

import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println((n1>n2)? n1 + " is greater than " + n2 : n2 + " is greater than " + n1);
        sc.close();
    }
}
