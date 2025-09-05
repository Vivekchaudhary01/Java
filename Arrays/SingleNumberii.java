// Single Number II
// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Example 1:
// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:
// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

public class SingleNumberii {
    public static void main(String[] args) {
        int arr[]={2,2,3,2};
        printArray(arr);
        SingleNumber2(arr);
    }
    public static void SingleNumber2(int n[]){
        int one=0,two=0;
        for(int i:n){
            one=(one^i)&~two;
            two=(two^i)&~one;
        }
        System.out.println(one);
    }
    public static void printArray(int num[]){
        for(int i:num)
            System.out.print(i+" ");
        System.out.println();
    }    
}
