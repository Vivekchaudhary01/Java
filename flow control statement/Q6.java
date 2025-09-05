//WAJP to take three angles of a triangle from user and print triangle is valid or not using if else statement.

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first angle of triangle: ");
        int a1=sc.nextInt();
        System.out.println("Enter the second angle of triangle: ");
        int a2=sc.nextInt();
        System.out.println("Enter the third angle of triangle: ");
        int a3=sc.nextInt();
        if(a1+a2+a3==180)
            System.out.println("The triangle is valid");
        else
            System.out.println("The triangle is not valid");
        sc.close();
    }
}
