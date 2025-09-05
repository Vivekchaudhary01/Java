// WAJP to print and count all the palindrome numbers in a given range.

import java.util.Scanner;

public class pallindromeinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        int count=0;
        while (a<b+1) {
            if(isPallindrome(a)){
                System.out.print(a+" ");
                count++;
            }
            a++;
        }
        System.out.print("Total Palindrome Numbers in the Range are: "+count);
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
}
