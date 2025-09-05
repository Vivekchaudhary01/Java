// Palindrome String:
// Check whether the given String is a palindrome String or NOT without Reversing(by using In-Place Algorithm).
// i/p :
// MADAM
// O/p:
// It is a Palindrome String.

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        int i = s1.length() - 1,j=0;
        while (i>j) {
            if(s1.charAt(j)!=s1.charAt(i)){
                System.out.println(s+" is not a Palindrome String."); 
                break;
            }
            i--;
            j++;    
        }
        if(i==j){
            System.out.println(s+" is a Palindrome String.");
        }
    } 
    
}
