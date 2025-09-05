// Write a program to get sum of all the prime numbers available in a List.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q15 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(2);
        c1.add(4);
        c1.add(3);
        c1.add(6);
        c1.add(89);
        int sum=0;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            Integer ele=itr.next();
            if(isPrime(ele)){
                sum+=ele;
            }
        }
        System.out.println(sum);
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
