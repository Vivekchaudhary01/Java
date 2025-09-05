package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program17 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);c1.add(77);
		System.out.println("Before Removing: "+c1);
		Iterator<Integer> itr=c1.iterator();
		while(itr.hasNext()) {
			int n=itr.next();
			if(n%2==1)
				itr.remove();
		}
		System.out.println("After Removing: "+c1);
		
	}

}
