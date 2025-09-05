// WAJP to create a collection of integers and count and print all the palindrome numbers available in collection.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q12 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(221);
        c1.add(414);
        c1.add(3333);
        c1.add(1221);
        c1.add(0);
        int count=0;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            Integer ele=itr.next();
            if(isPallindrome(ele)){
                System.out.println(ele);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPallindrome(Integer ele){
        String s=String.valueOf(ele);
        int i=0,j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }   
        return true;
    }      
}
