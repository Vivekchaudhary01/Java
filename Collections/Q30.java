// WAJP to print all the characters from String which has appeared more than once in the String/ print all duplicate characters.

import java.util.*;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine().toLowerCase();

        Map<Character,Integer> freqMap=new LinkedHashMap<>();
        for(char ch:input.toCharArray())
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);

        System.out.println("Duplicate Characters in String:");
        for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey()+" ");
        }
    }      
}
