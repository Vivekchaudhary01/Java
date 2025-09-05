// Write a java program to take a user input and count the even digits of the number.
// Input:
// N=42765;
// Output:
// 3

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            if((n%10)%2==0)
                count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
