// WAJP to remove all the duplicates from an Array.

import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        int []arr = {10, 20, 10, 30, 40, 50, 30, 60, 50};
        Set<Integer> unique = new LinkedHashSet<>();
        for(int n:arr){
            unique.add(n);
        }
        int result[]=new int[unique.size()];
        int i=0;
        for(int n:unique)
            result[i++]=n;

        System.out.println("Array after removing duplicates (keeping one):");
        for (int num : result) {
            System.out.println(num);
        }
    }      
}
