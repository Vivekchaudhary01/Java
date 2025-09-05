// WAJP to print and count all the  perfect numbers up to 100.
// A perfect number is a number that is equal to the sum of its proper positive divisors, excluding the number itself.
// For example, the first perfect number is 6, because 1 + 2 + 3 = 6.

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Perfect Numbers are: ");
        int count=0,n=1;
        while(n<=100){
            if(isPerfect(n)){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        System.out.println("\nCount of Perfect Numbers: "+count);
        sc.close();
    }
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if (n%i==0) {
                sum+=i; 
            }
        }
        return sum==n;
    }
}
