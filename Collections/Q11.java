// WAJP to create a collection of integers and count and print all the prime numbers available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q11 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(2);
        c1.add(4);
        c1.add(3);
        c1.add(6);
        c1.add(89);
        int count=0;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            Integer ele=itr.next();
            if(isPrime(ele)){
                System.out.println(ele);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(Integer ele){
        if(ele==2||ele==3)
            return true;
        if(ele<2)
            return false;
        if(ele%2==0)
            return false;
        for(int i=5;i*i<=ele;i+=6){
            if(ele%i==0)
                return false;
        }
        return true;
    }          
}
