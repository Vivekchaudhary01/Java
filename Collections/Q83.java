// WAJP to print all the unique characters in a String.
// Input: mohan and john
// Output: mdj

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();

        printUniqueCharacters(s);
        sc.close();
    }
    public static void printUniqueCharacters(String str){
        Map<Character,Integer> freqMap=new LinkedHashMap<>();
        for(char i:str.toCharArray()){
            if(i==' ')
                continue;
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        System.out.println("Unique Characters are:");

        for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()==1)
                System.out.print(entry.getKey());
        }    
    }         
}
