//WAJP to check and print the given number is a three digit number or not.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println((num >= 100 && num <= 999) || (num <= -100 && num >= -999) ? "The number is a three-digit number." : "The number is not a three-digit number.");
        scanner.close();
    }
}
