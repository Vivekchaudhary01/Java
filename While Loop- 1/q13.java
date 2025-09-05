// WAJP to print the nth term of Fibonacci series.
// i/p: 7
// o/p: 13

import java.util.Scanner;

public class q13 {
     public static void main(String[] args) {
        System.out.print("Enter the nth term of Fibonacci: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0) {
            System.out.println("0");
        }
        else{
            if (n==1) {
                System.out.println("1");
            }
            else{
                int current=1, prev=0, i=2, sum=0;
                while(i<=n){
                    sum = prev + current; 
                    prev = current;       
                    current = sum;        
                    i++;                  
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }        
}

