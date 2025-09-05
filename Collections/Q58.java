// Write a Java program to Find the minimum element in a queue 
// without removing it from the queue.

import java.util.*;

public class Q58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        Queue<Integer> queue=new LinkedList<>(); 
        for(int i=0;i<n;i++)
            queue.add(sc.nextInt());

        System.out.println("Queue: " + queue);
        
        Integer result = findMinimum(queue);
        System.out.println("Minimum element in the queue: " + result);

        System.out.println("Queue after finding min (unchanged):");

        sc.close();
    }   
    public static Integer findMinimum(Queue<Integer> queue){
        if(queue.isEmpty())
            return null;
        Integer min=Integer.MAX_VALUE;

        for(int ele:queue){
            if(ele<min)
                min=ele;
        }
        return min;
    } 
}
