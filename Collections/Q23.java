// Unique Elements in List

import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10, 20, 10, 30, 40, 50, 30, 60, 50);
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:l1){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        System.out.println("Unique Elements: ");
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
