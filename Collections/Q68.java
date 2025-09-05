import java.util.*;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        printFrequency(list);
    }

    public static void printFrequency(List<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }    
}
