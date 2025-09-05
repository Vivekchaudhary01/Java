// Write a program to perform minus operation on two List objects without duplicates and return it. 
// Maintain the insertion order of elements.
// l1: { 1, 3, 5, 6}
// l2: { 3, 4, 6, 8}
// o/p: l1-l2=> {1, 5}
// l2-l1=> {4, 8}
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1, 3, 5, 6);
        List<Integer> l2=Arrays.asList(3, 4, 6, 8);
        System.out.println(Difference(l1,l2));
    }
    public static List<Integer> Difference(List<Integer> l1,List<Integer> l2){
        List<Integer> diff=new ArrayList<>();
        for(Integer n:l1){
            if(!l2.contains(n))
                diff.add(n);
        }
        return diff;
    }
}
