// Write a java program to take a String input and print and count each digit character one by one.
// i/p: Ab43D6DE83ht
// o/p
// 4
// 3
// 6
// 8
// 3
// Total Digit characters are: 5

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int i=0,count=0;
        while (i<s.length()) {
            if(Character.isDigit(s.charAt(i))){
                System.out.println(s.charAt(i));
                count++;
            }
            i++;
        }
        System.out.println("Total Digit Characters are: "+count);
    }    
}
