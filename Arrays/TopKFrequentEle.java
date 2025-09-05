// Top K Frequent Elements
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]

import java.util.Scanner;

public class TopKFrequentEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,1,2,3,4,5,6,5,5,4,7};
        System.out.println("Original Array a: ");
        printArray(a);
        System.out.print("Enter value of K:");
        int k=sc.nextInt();
        TopKFrequentEle(a,k);    
    }  
    public static void TopKFrequentEle(int a[], int k){
        int max=a[0],min=a[0];
        for(int x:a){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<a.length;i++)
            freq[a[i]-min]++;

        for(int count=0;count<k;count++){
            int maxFreq=-1;
            int num=-1;
            for(int i=0;i<freq.length;i++){
                if(freq[i]>maxFreq){
                    maxFreq=freq[i];
                    num=i+min; 
                }
            }
            if(maxFreq==0) break; 
            System.out.print(num + " ");
            freq[num-min]=0; 
        }
        System.out.println();
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }    
}
