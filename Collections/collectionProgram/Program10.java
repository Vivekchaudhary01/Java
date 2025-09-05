package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program10 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(32);c1.add(50);
		c1.add(52);c1.add(60);
		Integer[] x=c1.toArray(new Integer[0]);
		int sum=0;
		for(Integer p:x) {
			System.out.println(p);
			sum=sum+p;
		}
		System.out.println("SUm is: "+sum);
		
		
	}

}
