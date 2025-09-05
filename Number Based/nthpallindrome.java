// WAJP to take user input and print nth palindrome number.

import java.util.Scanner;

public class nthpallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt(),count=0;
        for(int i=1;;i++) {
            if(isPallindrome(i)){  
                count++;
                if (count==n) {
                    System.out.println(n+ "th Pallindrome Number is : "+i);
                    break;
                }
            }   
        }
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

