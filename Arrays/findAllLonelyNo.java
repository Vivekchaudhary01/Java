// Find All Lonely Numbers in the Array
// You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.
// Return all lonely numbers in nums. You may return the answer in any order.
// Example 1:
// Input: nums = [10,6,5,8]
// Output: [10,8]
// Explanation: 
// - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
// - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
// - 5 is not a lonely number since 6 appears in nums and vice versa.
// Hence, the lonely numbers in nums are [10, 8].
// Note that [8, 10] may also be returned.
// Example 2:
// Input: nums = [1,3,5,3]
// Output: [1,5]
// Explanation: 
// - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
// - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
// - 3 is not a lonely number since it appears twice.
// Hence, the lonely numbers in nums are [1, 5].
// Note that [5, 1] may also be returned.

import java.util.*;

public class findAllLonelyNo {
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8};
        printArray(nums);
        List<Integer> result = findAllLonelyNo(nums);
        printList(result);
    }

    public static List<Integer> findAllLonelyNo(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = nums[0], min = nums[0];

        // Find min and max to determine range
        for (int i : nums) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        // Create frequency array for fast lookup
        int[] freq = new int[max - min + 1];
        for (int num : nums) {
            freq[num - min]++;
        }

        // Check each number for loneliness
        for (int i = 0; i < freq.length; i++) {
            boolean isLeftEmpty = (i == 0) || freq[i - 1] == 0;
            boolean isRightEmpty = (i == freq.length - 1) || freq[i + 1] == 0;
            if (freq[i] == 1 && isLeftEmpty && isRightEmpty) {
                result.add(i + min); // Add the actual number back
            }
        }

        return result;
    }

    // Helper method to print array
    public static void printArray(int[] nums) {
        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }

    // Helper method to print list
    public static void printList(List<Integer> list) {
        for (int x : list)
            System.out.print(x + " ");
        System.out.println();
    }
}

