//WAJP to take three sides of a triangle and print it is a valid triangle or not using if else statement.

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side of triangle:");
        int a=sc.nextInt();
        System.out.print("Enter the second side of triangle:");     
        int b=sc.nextInt();
        System.out.print("Enter the third side of triangle:");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
        sc.close();
    }
}
