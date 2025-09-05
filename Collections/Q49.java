import java.util.*;

public class Q49 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};

        System.out.println("Example 1 Output: " + majorityElement(nums1));
        System.out.println("Example 2 Output: " + majorityElement(nums2));
        System.out.println("Example 3 Output: " + majorityElement(nums3));
    }
    
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        int n = nums.length / 3;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n)
                result.add(entry.getKey());
        }

        return result;
    }
}
