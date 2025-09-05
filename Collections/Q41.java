// Write a program to perform intersection operation on two array elements without duplicates and return it. Maintain the insertion order of elements.
// a1: { 1, 3, 5, 6}
// a2: { 3, 4, 6, 8}
// o/p:{3, 6}

import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        int arr1[]={1,3,5,6};
        int arr2[]={3,4,6,8};
        System.out.println(Arrays.toString(Intersection(arr1,arr2)));
    }
    public static int[] Intersection(int arr1[],int arr2[]){
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:arr1)
            l1.add(i);
        for(int j:arr2){
            if(l1.contains(j)){
                l2.add(j);
            }
        }
        int result[]=new int[l2.size()];
        int i=0;
        for(int val:l2){
            result[i++]=val;
        }
        
        return result;
    }
}
