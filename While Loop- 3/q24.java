// Write a java program to take a user input and print the factorial of each digits of the number.
// Input:
// N=42065;
// Output:
// 5!=120
// 6!=720
// 0!=1 
// 2!=2
// 4!=24

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        FactorialOfDigits(n);
        sc.close();
    }
    static void FactorialOfDigits(int n){
        while(n>0){
            int fact=1;
            int num=n%10;
            while (num>1) {
                fact*=num;
                num--;
            }
            System.out.println(n%10 +" ! = " + fact);
            n/=10;
        }
    }
}
