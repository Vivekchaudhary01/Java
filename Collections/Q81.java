// Given a List of integers, write a program to find the first non-repeating element.


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        printFirstNonRepeatingElement(list);
        sc.close();
    }

    public static void printFirstNonRepeatingElement(List<Integer> list) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("First Non-Repeating Element is:");

        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;    
            }
        }
    }      
}
