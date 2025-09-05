// Write a java program to take a user input and print the sum of each digits of the number which are less than or equals to 5.
// Input:
// N=42765;
// Output:
// 11

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            if((n%10)<=5)
                sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
