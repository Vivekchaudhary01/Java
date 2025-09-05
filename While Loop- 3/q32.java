// WAJP to take user input and count the number of 0’s bits 
// and 1’s bits in that number.

import java.util.Scanner;

public class q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        countBinaryBits(n);
        sc.close();
    } 

    static void countBinaryBits(int n){
        int countzero=0,countone=0;
        while (n>0) {
            if(n%2==0)
                countzero++;
            else    
                countone++;
            n/=2;
        }
        System.out.println("0's bits: "+countzero+" and 1's bits: "+countone);
    } 
}
