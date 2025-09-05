// Write a java program to take a String input and print the sum of each digit characters.
// i/p: Ab43D6DE83ht
// o/p
// Total sum of  Digit characters are: 24

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int i=0,sum=0;
        while (i<s.length()) {
            if(Character.isDigit(s.charAt(i))){
                sum=sum+(s.charAt(i) - '0');
            }
            i++;
        }
        System.out.println("Total Sum of Digit Characters are: "+sum);
    }
}
