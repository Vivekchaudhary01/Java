// Circular Prime Check:
// A Circular Prime is a prime number that remains prime even after rotating 
// its digits.

// Example: 197 → 719 →  971 (All are prime).
// Write a Java program to check if a number is a Circular Prime using any loop.

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int digit = Integer.toString(n).length();
        boolean isCircularPrime = true;
        int originalNumber = n;
        do {
            if (!isPrime(n)) {
                isCircularPrime = false;
                break;
            }
            n = (n % 10) * (int) Math.pow(10, digit - 1) + (n / 10);
        } while (n != originalNumber);

        if (isCircularPrime) {
            System.out.println(originalNumber + " is a Circular Prime.");
        } else {
            System.out.println(originalNumber + " is not a Circular Prime.");
        }
    }   
    
    public static Boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0)
            return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
