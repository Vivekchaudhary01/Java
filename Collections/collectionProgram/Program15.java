package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program15 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		System.out.println(c1);
		Iterator<Integer> itr=c1.iterator();
		
		System.out.println(itr.next());
		itr.remove();
		System.out.println("==============");
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(c1);
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		
		
	}
}
