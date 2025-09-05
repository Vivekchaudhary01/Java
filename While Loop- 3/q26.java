// Write a java program to take a user input and print whether the number is a strong number or not.
// Input:
// N=145;
// Output:
// 145 is a Strong Number.
// Strong number:
// If the sum of factorials of each digit of a number is equal to number itself then it is a Strong number.
// Eg:
// N= 145
// Factorial sum=1!+4!+5!= 1+24+120= 145 which is equal to number itself

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        isStrongNumber(n);
        sc.close();
    }
    static void isStrongNumber(int n){
        int sum=0;
        int org=n;
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
        if (sum==org)
            System.out.println(org+" is a Strong Number.");
        else
            System.out.println(org+" is not a Strong Number.");
    }    
}
