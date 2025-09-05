// Find Common Elements Between Two Arrays.

import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        System.out.println(Arrays.toString(common(arr1,arr2)));
    }    
    public static int[] common(int nums1[],int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n1 : nums1){
            set.add(n1);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(int n2 : nums2){
            if(set.contains(n2)){
                resultSet.add(n2);
            }
        }
        int result[]=new int[resultSet.size()];
        int i=0;
        for(int val:resultSet)
            result[i++]=val;
        
        return result;
    }
}
