// Write a Java program to Find the smallest and second smallest 
// elements of array.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q59 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<n;i++)
            queue.add(sc.nextInt());

        findMinimum(queue);
   } 
   public static void findMinimum(Queue<Integer> queue){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int ele : queue) {
            if (ele < smallest) {
                secondSmallest = smallest;
                smallest = ele;
            } else if (ele != smallest && ele < secondSmallest) {
                secondSmallest = ele;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements might be equal).");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}
