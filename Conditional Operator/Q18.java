//WAJP to print the biggest of four numbers.

import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = sc.nextInt();
        System.out.println("Enter the 4th number: ");
        int d = sc.nextInt();
        int largest = (a > b) ? (a > c ? (a>d? a: d ): b > c ? b : c ): b > d ? b : d;
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
