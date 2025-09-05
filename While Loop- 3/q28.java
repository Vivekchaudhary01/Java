// Write a java program to take a user input and print whether the number is a palindrome number or not.
// Palindrome Number: if number and its reverse is same then it is called palindrome number.
// Input:
// N=34843
// Output:
// 34843 is a Palindrome Number

import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        boolean result=isPallindromeNumber(n);
        if(result)
            System.out.println(n+ " is a Pallindrome Number.");
        else
            System.out.println(n+" is not a Pallindrome Number.");
        sc.close();
    } 


// Using Number
    static boolean isPallindromeNumber(int n){
        int rev=0,org=n;
        while (n>0) {
            rev=rev*10+n%10;
            n/=10;
        }
        return org==rev;   
    } 
}


//! Using String 1
// 	public static boolean isPalindrome(String s){
// 		s=s.toLowerCase();
// 		int start=0, end=s.length()-1;
// 		while(start<end){
// 			if(s.charAt(start)!=s.charAt(end))
// 				return false;
// 		start++;
// 		end--;
// 		}
// 	return true;    


//! Using String 2
    // public static boolean isPalindrome(String s){
    // s=s.toLowerCase();
    // String rev="";
    // int i=0;
    // while(i<s.length()){
    //     rev=s.charAt(i)+rev;
    // i++;
    // }
    // return rev.equals(s);

