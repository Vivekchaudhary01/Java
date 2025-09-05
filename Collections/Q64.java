// Write a Java program to Move all Even elements to the front of the 
// queue while maintaining the relative order of other elements.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements in queue: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        moveEvenToFront(queue);

        System.out.println("Queue after moving even elements to front:");
        for (int ele : queue) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
    public static void moveEvenToFront(Queue<Integer> queue) {
        Queue<Integer> evenQueue = new LinkedList<>();
        Queue<Integer> oddQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int val = queue.poll();
            if (val % 2 == 0)
                evenQueue.add(val);
            else
                oddQueue.add(val);
        }
        
        queue.addAll(evenQueue);
        queue.addAll(oddQueue);
    }
    
}
