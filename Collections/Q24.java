// Write a program to identify and print all Unique elements in a Array.

import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        int[] arr={10, 20, 10, 30, 40, 50, 30, 60, 50};

        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:arr)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);

        System.out.println("Unique Elements in Array: ");
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
