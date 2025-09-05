// Write a program to perform minus operation on two array elements without duplicates and return it. Maintain the insertion order of elements.
// a1: { 1, 3, 5, 6}
// a2: { 3, 4, 6, 8}
// o/p: a1-a2=> {1, 5}
// a2-a1=> {4, 8}
import java.util.*;

public class Q39 {
    public static void main(String[] args) {
        int []a1= { 1, 3, 5, 6};
        int []a2= { 3, 4, 6, 8};
        System.out.println(Arrays.toString(Difference(a1,a2)));
    }    
    public static int[] Difference(int a1[], int a2[]){
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:a2){
            set2.add(i);
        }

        for(int j:a1){
            if(!set2.contains(j))
                set1.add(j);
        }

        int result[]=new int[set1.size()];
        int i=0;
        for(int val:set1)
            result[i++]=val;
        
        return result;
    }
}
