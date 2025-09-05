//WAJP to check whether the three sides of a triangle is valid or not.

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the sides of triangle: ");
        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
        sc.close();
    }
}
