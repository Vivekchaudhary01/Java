//? Majority Element
// The majority element in an array is defined as the element that appears more than ⌊n/2⌋ times, where n is the length of the array.
// In other words, it is the element that occurs most frequently and makes up more than half of the array.
// Given an array of integers, the task is to find the majority element and return it. If there is no majority element, return -1.
// Example 1:Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]Output: 4
// Example 2:Input: [1, 2, 3, 4, 5] Output: -1


public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Original Array: ");
        printArray(a);
        int element=MajorityElement(a);
        System.out.println(element);
    }  
    public static int MajorityElement(int a[]){
        //?1.  int max=a[0],min=a[0];
        // for(int x:a){
        //     if(x>max)   max=x;
        //     if(x<min)   min=x;
        // }

        // int freq[]=new int[max-min+1];
        // for(int i=0;i<a.length;i++)
        //     freq[a[i]-min]++;
        
        // int n=a.length/2;
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>n){
        //         return i+min;
        //     }
        // }
        // return -1;

        //?2.  for(int i=0;i<a.length;i++){
        //     int count=0;
        //     for(int j=0;j<a.length;j++){
        //         if(a[i]==a[j]){
        //             count++;
        //         }
        //     }
        //     if(count>a.length/2){
        //         return a[i];
        //     }
        // }
        // return -1;

        int idx=-1;
        int count=0;
        int n = a.length;
        for(int i=0;i<n;i++){
           if(count==0){
               idx=i;
               count++;
           }else{
               if(a[i]==a[idx]){
                   count++;
               }else count--;
           }
        }   
        int possible = a[idx];
        count=0;
        for(int i: a){
           if(i==possible) count++;
        }
        if(count>=n/2) 
           return possible;

        return -1;
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }     
}
