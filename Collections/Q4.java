// WAJP to create a collection and print all the odd Integer elements of the collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q4 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(10);
        c1.add(21);
        c1.add(32);
        c1.add(43);
        c1.add(50);
        Iterator<Integer> itr= c1.iterator();
        while (itr.hasNext()) {
            int i=itr.next();
            if(i%2==1)
                System.out.println(i);
        }
    }    
}
