// WAJP to print and count all prime numbers in a range where 
// sum of digits is also prime number.

import java.util.Scanner;

public class sumofPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of Number: ");
        int n=sc.nextInt(),count=0,i=2;

        while (i<n) {
            if(isPrime(i)){
                if(primeSum(i)){
                    System.out.print(i+" ");
                    count++;
                }
            }
            i++;
        }
        System.out.println("\nTotal Prime numbers are: "+count);
    }
    public static boolean primeSum(int n){
        int j=0,sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum>10)
            primeSum(sum);

        return isPrime(sum);
    }    
    public static boolean isPrime(int n) {
        if(n<2)
            return false;
        if(n==2 || n==3)
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
