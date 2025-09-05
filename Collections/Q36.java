// Write a program to perform union operation on two List objects without duplicates and return it. Maintain the insertion order of elements.
// l1: { 1, 3, 5, 6}
// l2: { 4, 6, 8}
// o/p: {1, 3, 5, 6, 4, 8}


import java.util.*;

public class Q36 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 3, 5, 6);
        List<Integer> l2 = Arrays.asList(4, 6, 8);

        List<Integer> result = union(l1, l2);
        System.out.println(result); 
    }    

    public static List<Integer> union(List<Integer> l1, List<Integer> l2) {
        Set<Integer> unionSet = new LinkedHashSet<>();

        unionSet.addAll(l1);
        unionSet.addAll(l2);

        return new ArrayList<>(unionSet);
    }
}
