//WAJP to check whether the given character is a special character or not.

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')? ch + " is not a special character." : ch + " is a special character.");
        sc.close();
    }
}
