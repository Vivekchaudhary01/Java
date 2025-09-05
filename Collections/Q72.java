// WAJP to print all the duplicate elements in a List.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        System.out.println("Enter the elements of list:");
        for(int i=0;i<n;i++)
            l1.add(sc.nextInt());

        printDuplicateElements(l1);
    }
    public static void printDuplicateElements(List<Integer> l1){
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int i:l1)
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        System.out.println("Duplicates are: ");
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet())
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
    }
}
