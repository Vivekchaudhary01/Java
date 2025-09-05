// WAJP to create a collection and print the largest String and smallest String available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q9 {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("Apple");
        c1.add("Banana");
        c1.add("Kiwi");
        c1.add("Orange");
        c1.add("Papaya");

        Iterator<String> itr=c1.iterator();
        String max="",min=itr.next();
        max=min;
        while (itr.hasNext()) {
            String s=itr.next();
            if(max.length()<s.length()) max=s;
            if(min.length()>s.length()) min=s;
        }
        System.out.println(max+" "+min);
    }      
}

