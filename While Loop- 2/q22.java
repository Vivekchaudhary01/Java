// WAJP to accept a number from user and print the number is a perfect number or not.
// i/p: 28
// o/p: 28 is a perfect number
// Perfect number: if the sum of all factors of a
// Number is equals to number itself then 
// It is a perfect number.

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int i=1,sum=0;
        while (i<=n/2) {
            if(n%i==0)
                sum+=i;
            i++;
        }
        if (sum==n) {
            System.out.println(n +" is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number.");
        sc.close();
    }    
}
