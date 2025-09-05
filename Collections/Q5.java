// WAJP to create a collection and print and count all the three digit integers available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q5 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(10);
        c1.add(212);
        c1.add(32);
        c1.add(423);
        c1.add(550);
        int count=0;
        Iterator<Integer> itr= c1.iterator();
        while (itr.hasNext()) {
            int n=itr.next();
            if(n>=100 && n<=999){
                System.out.println(n);
                count++;
            }
        }
        System.out.println(count);
    }      
}
