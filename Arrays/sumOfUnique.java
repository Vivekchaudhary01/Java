// Sum of Unique Elements
// You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
// Return the sum of all the unique elements of nums.
// Example 1:
// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.
// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.
// Example 3:
// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

public class sumOfUnique {
    public static void main(String[] args) {
        int nums[]={1,2,3,2};
        printArray(nums);
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int nums[]){
        int sum=0,max=nums[0],min=nums[0];
        for(int i:nums){
            if(i<min)   min=i;
            if(max<i)   max=i;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
            freq[nums[i]-min]++;
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1)
                sum+=(i+min);
        }
        return sum;
    }
    public static void printArray(int nums[]){
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }
}
