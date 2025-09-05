package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program18 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(46);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		System.out.println(c1);
		Iterator<Integer> itr=c1.iterator();
		while(itr.hasNext()) {
			int n=itr.next();
			System.out.println("Skipped Element is: "+n);
			if(n%2==1)
				break;
		}
		itr.forEachRemaining(n->System.out.println("Worked Element is: "+n));
		
	}

}
