// Palindrome String:
// Check whether the given String is a palindrome String or NOT by Reversing and comparing.
// i/p :
// MADAM
// O/p:
// It is a Palindrome String.

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        String original=s1,reverse="";
        int i = s1.length() - 1;
        while (i >= 0) {
            reverse+=s1.charAt(i);
            i--;
        }
        if(original.equals(reverse))
            System.out.println(s+" is a Palindrome String.");
        else
        System.out.println(s+" is not a Palindrome String."); 
    } 

}
