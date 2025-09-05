//WAJP to check and print the given number is an even number or not.

import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println((n%2==0)?"Even":"Odd");
        sc.close();
    }
}