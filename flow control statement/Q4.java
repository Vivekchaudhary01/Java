//WAJP to take a character input and print it is upper case, lower case or other alphabet using if else statement.

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println(ch+" is a lower case alphabet.");
        else 
            if(ch>='A' && ch<='Z') 
                System.out.println(ch+" is an upper case alphabet.");
            else
                System.out.println(ch+" is not an alphabet.");
        sc.close();
    }
}
