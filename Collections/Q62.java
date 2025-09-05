// Write a Java program to Find the sum of fist three smallest 
// elements of queue.

import java.util.*;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of Array: ");
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
            queue.add(sc.nextInt());
        
        System.out.println("Sum is: "+ sumOfThreeSmallest(queue));
    } 
    public static int sumOfThreeSmallest(Queue<Integer> queue) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(queue);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (!minHeap.isEmpty()) {
                sum += minHeap.poll(); 
            }
        }

        return sum;
    }       
}
