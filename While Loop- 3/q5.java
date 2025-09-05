// Write a java program to take a user input and print the biggest digit of the number.
// Input:
// N=43705;
// Output:
// 7


import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int max=0;
        while (n>0) {
            if (max<n%10) {
                max=n%10;
            }
            n/=10;
        }
        System.out.println(max);
        sc.close();
    }
}
