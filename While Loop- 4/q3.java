// Write a java program to take a String input and print each Lower case alphabet character one by one.
// i/p: AbDDEht
// o/p
// b
// h
// t

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        int i=0;
        while (i<s.length()) {
            System.out.println(Character.toLowerCase(s.charAt(i)));
            i++;
        }
    }
}
