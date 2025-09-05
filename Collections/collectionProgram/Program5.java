package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program5 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12); c1.add(45);c1.add(32);c1.add(50);
		System.out.println(c1);
		c1.forEach(n -> System.out.println(n));
		Iterator itr=c1.iterator();
		
		
		
	}
}
