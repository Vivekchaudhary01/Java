// WAJP to print the frequency of each characters in a String.

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();

        printFrequencyOfEachCharacters(s);
        sc.close();
    }
    public static void printFrequencyOfEachCharacters(String str){
        Map<Character,Integer> freqMap=new LinkedHashMap<>();
        for(char i:str.toCharArray()){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        System.out.println("Frequency Of Each Characters is:");

        for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }    
    }     
}
