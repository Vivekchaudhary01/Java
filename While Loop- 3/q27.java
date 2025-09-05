// Write a java program to take a user input and reverse the number.
// Input:
// N=3745;
// Output:
// 5473

import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        reverseNumber(n);
        sc.close();
    }
    static void reverseNumber(int n){
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
    } 
}
