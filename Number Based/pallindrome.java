// WAJP to take user input and check the number is palindrome or not.

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        if(isPallindrome(n))
            System.out.println(n+" is a Palindrome Number. ");
        else
            System.out.println(n+" is not a Palindrome Number.");
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
