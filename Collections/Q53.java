// WAJP to Merge three sorted lists with duplicates but merged 
// array shouldn’t have duplicates.

import java.util.*;

public class Q53 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 6, 7);
        List<Integer> list3 = Arrays.asList(0, 3, 5, 8, 9);

        List<Integer> merged = mergeThreeSortedLists(list1, list2, list3);

        System.out.println("Merged list without duplicates: " + merged);
    }
    public static List<Integer> mergeThreeSortedLists(List<Integer> l1,List<Integer> l2,List<Integer> l3){
        Set<Integer> merge=new TreeSet<>();
        merge.addAll(l1);
        merge.addAll(l2);
        merge.addAll(l3);
        return new ArrayList<>(merge);
    }      
}
