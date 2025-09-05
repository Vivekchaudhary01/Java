// Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:
// Input: nums = [1]
// Output: 1

public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={2,2,1};
        printArray(arr);
        SingleNumber(arr);
    }
    public static void SingleNumber(int n[]){
        int result=0;
        for(int i:n){
            result^=i;
        }
        System.out.println(result);
    }
    public static void printArray(int num[]){
        for(int i:num)
            System.out.print(i+" ");
        System.out.println();
    }
}
