// Write a program to perform intersection operation on two list objects without duplicates and return it. Maintain the insertion order of elements.
// l1: { 1, 3, 5, 6}
// l2: { 3, 4, 6, 8}
// o/p:{3, 6}

import java.util.*;

public class Q40{
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,3,5,6);
        List<Integer> l2=Arrays.asList(3,4,6,8);
        System.out.println(Intersection(l1,l2));
    }
    public static List<Integer> Intersection(List<Integer> l1,List<Integer> l2){
        List<Integer> result=new ArrayList<>();
        for(int i: l1){
            if(l2.contains(i))
                result.add(i);
        }
        return result;
    }

}