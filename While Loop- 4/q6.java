// Write a java program to take a String input and print the reverse of it.
// i/p:
// mohan
// o/p
// nahom

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int i = s.length() - 1;
        while (i >= 0) {
            System.out.print(s.charAt(i));
            i--;
        }
    }    
}

