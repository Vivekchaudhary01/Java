// First Missing Positive
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// Example 1:
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:
// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:
// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.
public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(findFirstMissingPositive(arr));
    }
    public static int findFirstMissingPositive(int nums[]){
        int i,count;
        if(nums.length==1&&(nums[0]>1||nums[0]<=0))
            return 1;
        if(nums.length==1&&nums[0]==1)
            return 2;
        for(i=1;i<=nums.length;i++){
            count=0;
            for(int j:nums){
                if(j==i)    count++;
            }
            if(count==0)    return i;
        }
        return i; 
        
        // int temp=0,x;
        // for(int i=0;i<nums.length;i++){
        //     while(nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){
        //         x=nums[i]-1;
        //         temp=nums[i];
        //         nums[i]=nums[x];
        //         nums[x]=temp;
        //     }
        // }
        // for(int i=0;i<nums.length;i++)
        //     if((i+1)!=nums[i])
        //         return i+1;

        // return nums.length+1;
    }
}
