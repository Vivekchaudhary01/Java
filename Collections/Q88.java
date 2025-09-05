// WAJP to print the characters in a String with highest Frequency. 
// If two characters has highest frequency then print the smaller character.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();

        printHighestFrequencyCharacters(s);
        sc.close();
    }
    public static void printHighestFrequencyCharacters(String str){
        Map<Character,Integer> freqMap=new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') 
                freqMap.put(ch,freqMap.getOrDefault(ch, 0)+1);            
        }

        System.out.println("Highest Frequency Characters is:");
        int maxFreq=0;
        char c=str.charAt(0);
        for (Map.Entry<Character,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                c=entry.getKey();
            }
            else if(entry.getValue()== maxFreq && entry.getKey()<c)
                c=entry.getKey();
        }
        System.out.println(c+" -> "+maxFreq);
    }     
}
