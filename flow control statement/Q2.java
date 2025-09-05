//WAJP to print all are equal if all have same value or print biggest of three numbers using if else statement.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int n2=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int n3=sc.nextInt();
        if(n1==n2 && n2==n3)
        {
            System.out.println("All the numbers are equal");
        }
        else
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println("The greatest number is:"+n1);
            }
            else
            {
                System.out.println("The greatest number is:"+n3);
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println("The greatest number is:"+n2);
            }
            else
            {
                System.out.println("The greatest number is:"+n3);
            }
        }
        sc.close();
    }
}
