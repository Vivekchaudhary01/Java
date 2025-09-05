// Write a java program to take a String input and print each character one by one.
// i/p: MOHAN
// o/p
// M
// O
// H
// A
// N



import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int i=0;
        while (i<s.length()) {
            System.out.println(s.charAt(i));
            i++;
        }
    }
}