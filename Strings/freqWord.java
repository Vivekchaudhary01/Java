import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        frequencyWord(s);
    }    
    public static void frequencyWord(String s){
        String[] words = s.toLowerCase().split("\\s+");
        Map<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
