import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toLowerCase();
        String str[]=s.split("\\s+");
        printHighestFrequencyCharacters(str);
        sc.close();
    }
    public static void printHighestFrequencyCharacters(String str[]){
        Map<String,Boolean> freqMap=new LinkedHashMap<>();
        for (String ch : str) {
            if(!freqMap.containsKey(ch))
            freqMap.put(ch,true);            
        }     
        System.out.println("Frequency of Each Word is:");
        for(String word:freqMap.keySet())
            System.out.print(word+" ");
    }     
}
