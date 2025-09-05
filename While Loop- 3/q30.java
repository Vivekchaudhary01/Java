// WAJP to take user input and count the number of binary bits in that number when it is represented in binary form.

// eg: n=20
// o/p
// 5 

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        countBinaryBits(n);
        sc.close();
    } 


    static void countBinaryBits(int n){
        int count=0;
        while (n>0) {
                count++;
            n/=2;
        }
        System.out.println(count);
    }     
}
