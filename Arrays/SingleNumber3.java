// Single Number III
// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
// Example 1:
// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
// Example 2:
// Input: nums = [-1,0]
// Output: [-1,0]
// Example 3:
// Input: nums = [0,1]
// Output: [1,0]

import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,5};
        printArray(arr);
        int a[]=SingleNumber3(arr);
        printArray(a);
    }
    public static int[] SingleNumber3(int nums[]){
        // int result=0;
        // for(int i:nums){
        //     result^=i;
        // }
        // int diffBit = result & (-result);
        // int a = 0, b = 0;
        // for (int num : nums) {
        //     if ((num & diffBit) == 0)
        //         a ^= num;
        //     else
        //         b ^= num;
        // }
        // return new int[]{a,b};
        
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int n:nums)
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);

        int result[]=new int[2];
        int index=0;
        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            if(entry.getValue()==1)
                result[index++]=entry.getKey();
        }
        return result;
    }
    public static void printArray(int num[]){
        for(int i:num)
            System.out.print(i+" ");
        System.out.println();
    }        
}
