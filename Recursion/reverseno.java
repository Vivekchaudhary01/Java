// WAJP to reverse a number by using recursion.

import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Reverse of"+n+" is: "+reverseNo(n,0));
    }
    public static int reverseNo(int n,int rev){
        if (n == 0) {
            return rev;
        }
        return reverseNo(n / 10, rev * 10 + n % 10);

    } 
}
