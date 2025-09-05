import java.util.*;

public class particlularWordOcuurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        maxFreqWord(s);
    }     
    public static void maxFreqWord(String s){
        Scanner sc=new Scanner(System.in);
        String words[]=s.split("\\s+");
        int count=0;
        Map<String, Integer> freqMap=new HashMap<>();
        for(String word:words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }

        System.out.println("Enter the word:");
        String str=sc.nextLine();
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if(entry.getKey().equals(str)){
                System.out.println("The word \""+entry.getKey()+"\"  has appeared "+entry.getValue()+" times");
            }
        }
    }      
}
