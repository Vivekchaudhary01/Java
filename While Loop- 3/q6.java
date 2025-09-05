// Write a java program to take a user input and print the difference of biggest digit and smallest digit of the number.
// Input:
// N=42375;
// Output:
// 5

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        while (n>0) {
            if (max<n%10) 
                max=n%10;
            else if (min>n%10)
                min=n%10;
            n/=10;
        }
        System.out.println(max-min);
        sc.close();
    }
}
