//WAJP to print big of two numbers using if else statement.

import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println("The greater number is: "+n1);
        else
            System.out.println("The greater number is: "+n2);
        sc.close();    
    }
}