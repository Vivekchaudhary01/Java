// Write a java program to take a user input and count all the digits of the number which are less than or equals to 5.
// Input:
// N=42765;
// Output:
// 3

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            if((n%10)>=5)
                count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
