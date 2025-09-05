// WAJP to create a collection and print the largest integer and smallest integer available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q7 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(50);
        c1.add(40);
        c1.add(30);
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            int n=itr.next();
            if(max<n)
                max=n;
            if(min>n)
                min=n;
        }
        System.out.println(max+" "+min);
    }       
}
