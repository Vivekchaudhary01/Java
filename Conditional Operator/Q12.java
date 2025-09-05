//WAJP to check whether the given character is an upper case alphabet or not.

import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = sc.next().charAt(0);
        System.out.println((ch>='A'&& ch<='Z')?"Uppercase":"Not in uppercase");
        sc.close();
    }
}
