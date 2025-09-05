// Write a Java program to sort an array by using PriorityQueue(Heap Sort).

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }  

    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        int index = 0;
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }  
}
