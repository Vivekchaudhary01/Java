// WAJP to create a collection and remove all the elements other than Integer from the collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q10 {
    public static void main(String[] args) {
        Collection<Object> c1=new ArrayList<>();
        c1.add("Apple");
        c1.add(10);
        c1.add("Kiwi");
        c1.add(30);
        c1.add("Papaya");

        Iterator<Object> itr=c1.iterator();
        while (itr.hasNext()) {
            Object ele=itr.next();
            if(!(ele instanceof Integer))
                itr.remove();
        }
        for(Object o:c1){
            System.out.println(o);
        }
    }          
}
