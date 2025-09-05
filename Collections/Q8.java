// WAJP to create a collection of Strings and print the length of each String available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q8 {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("Apple");
        c1.add("Banana");
        c1.add("Kiwi");
        c1.add("Orange");
        c1.add("Papaya");

        Iterator<String> itr=c1.iterator();
        while (itr.hasNext()) {
            String s=itr.next();
            System.out.println(s+","+s.length());
        }
    }      
}
