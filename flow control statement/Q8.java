//WAJP to take three sides of a triangle and print it is equilateral, isosceles or scalene triangle or not using if else statement.

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side of triangle:");
        int a=sc.nextInt();
        System.out.print("Enter the second side of triangle:");
        int b=sc.nextInt(); 
        System.out.print("Enter the third side of triangle:");
        int c=sc.nextInt();
        if(a==b&&b==c)
            System.out.println("Triangle is equilateral");
        else if(a==b||b==c||c==a)
            System.out.println("Triangle is isosceles");
        else
            System.out.println("Triangle is scalene");
        sc.close();
    }
}
