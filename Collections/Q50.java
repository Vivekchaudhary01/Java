// Write a program to partition a List of integers into two sublists:
// One with all even numbers. 
// Another with all odd numbers.

import java.util.*;

public class Q50 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 21, 32, 43, 54, 65, 76, 87);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        partitionList(numbers, evenNumbers, oddNumbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    } 
    public static void partitionList(List<Integer> numbers, List<Integer> evenList, List<Integer> oddList) {
        for (int num : numbers) {
            if (num % 2 == 0)
                evenList.add(num);
            else
                oddList.add(num);
        }
    }   
}
