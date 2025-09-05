// WAJP to print and count all the  Prime numbers up to a given range.

import java.util.Scanner;

public class primenRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt(),i=2,count=0;
        while (i<n) {
            if(isPrime(i)){
                System.out.print(i+" ");  
                count++;
            }   
            i++;
        }
        System.out.println("\nTotal Prime Numbers are: "+count);
 
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
