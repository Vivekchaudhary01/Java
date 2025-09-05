// WAJP to print the element in a List with highest Frequency. 
// If two element has highest frequency then print the smaller element.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        printHighestFrequencyElement(list);
        sc.close();
    }

    public static void printHighestFrequencyElement(List<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Max Freq Element is:");
        int maxFreq=0;
        int maxFreqElement=list.get(0); 

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq=entry.getValue();
                maxFreqElement=entry.getKey();
            }
            else if (entry.getValue()==maxFreq && entry.getKey()<maxFreqElement) {
                maxFreqElement=entry.getKey();
            }
        }
        System.out.println(maxFreqElement);
    }      
}

