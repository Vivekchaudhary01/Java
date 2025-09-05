// Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        printArray(nums);
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        
        System.out.println(SearchInsertPosition(nums,target));
    }
    public static int SearchInsertPosition(int nums[],int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else{
                if(nums[mid]<target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return low;
    }
    public static void printArray(int nums[]){
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
