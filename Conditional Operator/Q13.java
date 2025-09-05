//WAJP to check whether the given character is a lower case alphabet or not.

import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character:");
        char ch=sc.next().charAt(0);
        System.out.println((ch>='a'&&ch<='z')?"Lowercase":"Not in lowercase");
        sc.close();
    }
}
