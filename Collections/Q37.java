// Write a program to perform union operation on two array elements without duplicates and return it. 
// Maintain the insertion order of elements.
// arr1: { 1, 3, 5, 6}
//  arr2: { 4, 6, 8}
// o/p: {1, 3, 5, 6, 4, 8}
import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        int arr1[]={1, 3, 5, 6};
        int arr2[]={4, 6, 8};

        int []result = union(arr1, arr2);
        System.out.println(Arrays.toString(result)); 
    }  
    public static int[] union(int arr1[],int arr2[]){
        Set<Integer> merge=new LinkedHashSet<>();
        for(int i:arr1)
            merge.add(i);
        for(int j:arr2)
            merge.add(j);
        
        int [] result=new int[merge.size()];
        int i=0;
        for(int val:merge){
            result[i++]=val;
        }

        return result;
    }      
}
