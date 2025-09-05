// WAJP to print  all the  alternate Prime numbers up to a given range.
// o/p:
// 2 5 11 17….
// Or
// 3 7 13 19

import java.util.Scanner;

public class alteranatePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of Number: ");
        int n=sc.nextInt(),idx=1;
        System.out.println("Enter from where you want to start: ");
        int i=sc.nextInt();
        while (i<n) {
            if(isPrime(i)){
                if(idx%2!=0)
                    System.out.print(i+" ");
                idx++;  
            }   
            i++;
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
