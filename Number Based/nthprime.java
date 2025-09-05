// WAJP to take user input and print nth prime number.

import java.util.Scanner;

public class nthprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt(),count=0;
        for(int i=2;;i++) {
            if(isPrime(i)){  
                count++;
                if (count==n) {
                    System.out.println(n+ "th Prime Number is : "+i);
                    break;
                }
            }   
        }
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
