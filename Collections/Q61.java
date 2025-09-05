// Kth Largest Element in an Array:
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

import java.util.*;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println(findKthLargestElement(arr,k));
    } 
    public static int findKthLargestElement(int nums[],int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        return minHeap.peek();
    } 
}
