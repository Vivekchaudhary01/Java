// Write a program to find two numbers in a List whose sum is equals to a target value provided 
// by the user.

// Two Sum program!!

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
            nums.add(sc.nextInt());
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        findTwoSum(nums, target);
        sc.close();
    }

    public static void findTwoSum(List<Integer> nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + " + " + num + " = " + target);
                return;
            }
            map.put(num, i);
        }
        System.out.println("No pair found with the given target sum.");
    } 
}
