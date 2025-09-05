// WAJP to take user input and print whether the number is Armstrong number or not.
// Armstrong number is a number that is equal to the sum of the cubes of its digits.
// For example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n+" is an Armstrong NUmber. ");
        }
        else
            System.out.println(n+ " is not an Armstrong Number");
    }
    
    public static boolean isArmstrong(int n){
        int temp=n,sum=0;
        while (temp!=0) {
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }
        return sum==n;
    }
}
