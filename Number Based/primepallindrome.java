// WAJP to print and count all the palindrome numbers in a range which is also a prime number.

import java.util.Scanner;

public class primepallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt(),count=0,i=2;
        while(i<n) {
            if(isPallindrome(i) && isPrime(i)){  
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("\nTotal Numbers are: "+count);   
    }

    public static boolean isPallindrome(int n){
        String s = Integer.toString(n);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;  
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
