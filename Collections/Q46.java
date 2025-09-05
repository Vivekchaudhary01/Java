// Intersection of Two Arrays II
// Given two integer arrays nums1 and nums2, return an array of 
// their intersection. Each element in the result must appear as 
// many times as it shows in both arrays and you may return 
// the result in any order.

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
// Constraints:
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

import java.util.*;

public class Q46 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }    
    public static int[] intersect(int nums1[],int nums2[]){
        if(nums1.length>nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num1:nums1){
            freqMap.put(num1,freqMap.getOrDefault(num1,0)+1));
        }
        int k=0;
        for(int num2:nums2){
            int mapValue=freqMap.getOrDefault(num2,0);
            if(mapValue>0){
                nums1[k++]=num2;
                freqMap.put(num2,mapValue-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
