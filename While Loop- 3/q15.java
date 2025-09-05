// Write a java program to take a user input and print the sum of each odd digits of the number.
// Input:
// N=42763;
// Output:
// 10

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            if((n%10)%2!=0)
                sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
