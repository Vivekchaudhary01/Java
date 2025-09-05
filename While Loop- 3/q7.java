// Write a java program to take a user input and count the total digit of the number.
// Input:
// N=43705;
// Output:
// 5

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
