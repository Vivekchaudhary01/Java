//WAJP to take a character input and print it is an upper case alphabet, lower case alphabet, a digit or a special character using if else statement.

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}
