import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class highestFreqWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        maxFreqWord(s);
    }     
    public static void maxFreqWord(String s){
        String words[]=s.split("\\s+");
        int count=0;
        Map<String, Integer> freqMap=new HashMap<>();
        for(String word:words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }

        String maxWord = null;
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        if (maxWord != null) {
            System.out.println("Word with highest frequency: " + maxWord);
            System.out.println("Frequency: " + maxFreq);
        } else {
            System.out.println("No valid words found.");
        }
    }     
}
