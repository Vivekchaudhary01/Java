// WAJP to create a collection and iterate over the collection.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("Apple");
        c1.add("Banana");
        c1.add("Orange");
        c1.add("Kiwi");
        c1.add("Papaya");
        Iterator<String> itr= c1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }    
}