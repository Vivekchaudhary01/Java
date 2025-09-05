// Write a java program to take a user input and print the product of each digit of the number will be even or Odd.
// Input:
// N=9735;
// Output:
// It will give Odd Product

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int product=1;
        while (n>0) {
            product*=n%10;
            n/=10;
        }
        if (product%2==0) 
            System.out.println("It will give Even Product.");
        else
            System.out.println("It will give Odd Product.");
        sc.close();
    }
}
