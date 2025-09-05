// Write a Java program to Print the all Negative numbers in the queue.


import java.util.*;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements in queue: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        printNegativeNumbers(queue);
    }    
    public static void printNegativeNumbers(Queue<Integer> queue){
        for(int n:queue){
            if(n<0)
                System.out.println(n);
        }
    }
}
