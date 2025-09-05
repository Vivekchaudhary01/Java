// WAJP to print the word which has appeared for maximum times  in the String.
// Input: mohan is coming and sohan is coming is good
// Output:
// is

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q94 {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();
        String str[]=s.split("\\s+");
        printHighestFrequencyCharacters(str);
        sc.close();
    }

    public static void printHighestFrequencyCharacters(String str[]){
        Map<String,Integer> freqMap=new HashMap<>();
        for (String ch : str) { 
            freqMap.put(ch,freqMap.getOrDefault(ch, 0)+1);            
        }
        int maxFreq=0;
        String word="";
        System.out.println("Frequency of Each Word is:");
        for (Map.Entry<String,Integer> entry:freqMap.entrySet())
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                word=entry.getKey();
            }
        System.out.println(word);
    }         
}
