import java.util.*;

public class freqWordOnce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        frequencyWord(s);
    } 
    public static void frequencyWord(String s){
        String words[]=s.split("\\s+");
        int count=0;
        Map<String, Integer> freqMap=new HashMap<>();
        for(String word:words){
            if(!word.isEmpty())
                freqMap.put(word,freqMap.getOrDefault(word, 0)+1);
        }
        for(Map.Entry<String,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                count++;
            }
        }
        System.out.println(count);
    }    
}
