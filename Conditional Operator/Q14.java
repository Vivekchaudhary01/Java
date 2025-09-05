//WAJP to check whether the given character is an alphabet or not.

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character:");
        char ch=sc.next().charAt(0);
        System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?"Alphabet":"Not an alphabet");
        sc.close();
    }
}
