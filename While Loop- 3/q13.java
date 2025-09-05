// Write a java program to take a user input and print the sum of each digit of the number.
// Input:
// N=4207065;
// Output:
// 24

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
