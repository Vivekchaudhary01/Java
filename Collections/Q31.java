// WAJP to remove all duplicate characters from String.

import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine().toLowerCase();

        Set<Character> unique=new LinkedHashSet<>();
        
        for(char ch:input.toCharArray())
            if(ch!=' ')
                unique.add(ch);

        System.out.println(" After Removing Duplicate:");
        StringBuilder sb=new StringBuilder();
        for(char c:unique)
            sb.append(c);
        System.out.println(sb.toString());
    }      
}
