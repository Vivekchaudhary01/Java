import java.util.*;

public class removeDuplicateWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        removeDuplicateWords(s);
    }     
    public static void removeDuplicateWords(String s){
        // String words[]=s.split("\\s+");
        // Map<String, Integer> freqMap=new LinkedHashMap<>();
        // for(String word:words){
        //     freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        // }

        // for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
        //     if(entry.getValue()>0){
        //         System.out.print(entry.getKey()+" ");
        //         entry.setValue(0);
        //     }
        // }

        String[] words = s.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        for (String word : uniqueWords) {
            System.out.println(word);
        }

    }      
}
