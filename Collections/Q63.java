// Write a Java program to Find the Longest string in the queue.

import java.util.*;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextLine());
        }

        String longest = findLongestString(queue);

        System.out.println("Longest string in the queue: " + longest);
    } 
    public static String findLongestString(Queue<String> queue) {
        String longest = "";
        int maxLength = 0;

        for (String str : queue) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longest = str;
            }
        }
        return longest;
    }
}
