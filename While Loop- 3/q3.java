// Write a java program to take a user input and print each odd digits of the number one by one.
// Input:
// N=43705;
// Output:
// 5
// 7
// 3

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        while (n>0) {
            if ((n%10)%2!=0) {
                System.out.println(n%10);
            }
            n/=10;
        }
        sc.close();
    }
}
