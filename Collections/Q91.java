// WAJP to print and count each word in a String which has appeared only once.
// Input: mohan is coming and sohan is coming
// Output:
// mohan
// and
// sohan
// Total words:   3

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q91 {
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
        int count=0;
        System.out.println("Frequency of Each Word is:");
        for (Map.Entry<String,Integer> entry:freqMap.entrySet())
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                count++;
            }
        System.out.println("Total Count is: "+count);
    }     
}
