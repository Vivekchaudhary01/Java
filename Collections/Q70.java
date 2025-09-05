// WAJP to print all the unique elements in a List.

import java.util.*;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        printUniqueElements(list);
        sc.close();
    }

    public static void printUniqueElements(List<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique elements are:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }    
}
