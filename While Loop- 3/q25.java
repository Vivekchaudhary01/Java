// Write a java program to take a user input and print the sum of factorial of each digits of the number.
// Input:
// N=42065;
// Output:
// 867 (120+720+1+2+24)

import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        sumOfFactorialOfDigits(n);
        sc.close();
    }
    static void sumOfFactorialOfDigits(int n){
        int sum=0;
        while(n>0){
            int fact=1;
            int num=n%10;
            while (num>1) {
                fact*=num;
                num--;
            }
            sum+=fact;;
            n/=10;
        }
        System.out.println(sum);
    }
}
