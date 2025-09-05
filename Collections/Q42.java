// Write a program to compare two List objects and return:
// The common elements between them.
// The elements present only in the first list but not in the second.
// The elements present only in the second list but not in the first.

import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,3,5,6);
        List<Integer> l2=Arrays.asList(3,4,6,8);
        System.out.println(common(l1,l2));
        System.out.println(diff(l1,l2));
        System.out.println(diff(l2,l1));
    }    
    public static List<Integer> common(List<Integer> l1, List<Integer> l2){
        List<Integer> result=new ArrayList<>();
        for(int i:l2){
            if(l1.contains(i))
                result.add(i);
        }
        return result;
    }
    public static List<Integer> diff(List<Integer> l1, List<Integer> l2){
        List<Integer> result=new ArrayList<>();
        for(int i:l1){
            if(!l2.contains(i))
                result.add(i);
        }
        return result;
    }    
}
