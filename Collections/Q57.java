// write a Java program to Find the first non-repeating element in 
// the array using a queue.

import java.util.*;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Integer result = findFirstNonRepeating(arr);
        if (result != null) {
            System.out.println("First non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }

        sc.close();
    }
    public static Integer findFirstNonRepeating(int arr[]){
        Queue<Integer> queue=new LinkedList<>();
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int i:arr){
            freqMap.put(i,freqMap.getOrDefault(i, 0)+1);
            queue.offer(i);
            while (!queue.isEmpty()&& freqMap.get(queue.peek())>1) {
                queue.poll();
            }
        }
        return queue.isEmpty()? null:queue.peek();
    }
}
