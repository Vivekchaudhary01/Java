// Write a program to store all the Fibonacci numbers up to a range in a List.

import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit (range): ");
        int n = sc.nextInt();

        List<Integer> fibList = generateFibonacciUpTo(n);

        for (int val : fibList) {
            System.out.print(val + " ");
        }
    }

    public static List<Integer> generateFibonacciUpTo(int n) {
        List<Integer> list = new ArrayList<>();

        int a = 0, b = 1;
        while (a <= n) {
            list.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return list;
    }
}

