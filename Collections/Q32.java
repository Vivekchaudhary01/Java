// Find All Numbers Disappeared in an Array:

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class Q32 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums)); // Output: [5, 6]
    }   

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int number[]=new int [nums.length+1];
        for(int n:nums)
            number[n]++;
        for(int i=1;i<nums.length;i++)
            if(number[i]==0) result.add(i);
        
        return result;
    } 
}
