// Write a java program to take a String input and print each upper case alphabet character one by one.
// i/p: AbDDEht
// o/p
// A
// D
// D
// E



import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int i=0;
        while (i<s.length()) {
            System.out.println(Character.toUpperCase(s.charAt(i)));
            i++;
        }       
    }    
}
