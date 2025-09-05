// WAJP to print whether the list is in sorted order or not.
import java.util.*;

public class Q52 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 1, 2);

        System.out.println("List1 is sorted? " + isSorted(list1));
        System.out.println("List2 is sorted? " + isSorted(list2));
    }  
    public static boolean isSorted(List<Integer> l1){
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)>l1.get(i+1))
                return false;
        }
        return true;
    }  
}
