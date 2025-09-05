// Write a program to compare two array elements and return:
// The common elements between them.
// The elements present only in the first array but not in the second.
// The elements present only in the second array but not in the first.

import java.util.*;

public class Q43 {
    public static void main(String[] args) {
        int arr1[]={1,3,5,6};
        int arr2[]={3,4,6,8};
        System.out.println(Arrays.toString(common(arr1,arr2)));
        System.out.println(Arrays.toString(diff(arr1,arr2)));
        System.out.println(Arrays.toString(diff(arr2,arr1)));
    }    
    public static int[] common(int arr1[],int arr2[]){
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        for(int i:arr1)     
            l1.add(i);
        for(int j:arr2){
            if(l1.contains(j))
                l2.add(j);
        }
        int result[]=new int[l2.size()];
        int i=0;
        for(int val:l2)
            result[i++]=val;
            
        return result;
    }
    public static int[] diff(int arr1[],int arr2[]){
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        for(int i:arr2)     
            l1.add(i);
        for(int j:arr1){
            if(!(l1.contains(j)))
                l2.add(j);
        }
        int result[]=new int[l2.size()];
        int i=0;
        for(int val:l2)
            result[i++]=val;

        return result;
    }    
}
