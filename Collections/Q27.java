// WAJP to remove all the duplicates from a List.

import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10, 20, 10, 30, 40, 50, 30, 60, 50);
        Set<Integer> unique = new LinkedHashSet<>(l1);
        System.out.println("List after removing duplicates (keeping one):");
        for (int num : unique) {
            System.out.println(num);
        }
    }   
}
