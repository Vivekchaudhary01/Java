package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(32);c1.add(50);
		c1.add(52);c1.add(60);
		Object[] o=c1.toArray();
		int sum=0;
		for(Object p:o) {
			sum=sum+(Integer)p;
		}
		System.out.println("Sum is: "+sum);
	}

}
