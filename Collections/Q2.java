import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        Iterator<Integer> itr= c1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
