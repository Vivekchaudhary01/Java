// WAJP to remove all the duplicate characters in a String.
// Input: mohan and john
// Output: mohandj

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();

        printRemoveDuplicateCharacters(s);
        sc.close();
    }
    public static void printRemoveDuplicateCharacters(String str){
        Map<Character,Boolean> freqMap=new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ' && !freqMap.containsKey(ch)) 
                freqMap.put(ch, true);            
        }

        System.out.println("Remove Duplicate Characters are:");

        for (char ch : freqMap.keySet()) 
            System.out.print(ch);
    }     
}
