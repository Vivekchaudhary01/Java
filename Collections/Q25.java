// Write a program to identify and print all duplicate elements in a List.

import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(10, 20, 10, 30, 40, 50, 30, 60, 50);
        Map<Integer,Integer> freMap=new HashMap<>();
        for(int n:l1){
            freMap.put(n,freMap.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: freMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }
}
