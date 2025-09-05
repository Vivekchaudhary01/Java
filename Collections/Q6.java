// WAJP to create a collection and calculate sum of all the integer elements of collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q6 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(50);
        c1.add(40);
        c1.add(30);
        int sum=0;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            sum+=itr.next();
        }
        System.out.println(sum);
    }    
}
