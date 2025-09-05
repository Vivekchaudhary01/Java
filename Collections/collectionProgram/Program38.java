package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program38 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(50); c1.add(40);c1.add(10);c1.add(50);
		c1.add(10);c1.add(60);c1.add(50);
		System.out.print(c1+" ");
		System.out.println();
		int sum=c1.stream().mapToInt(n->n).sum();
		System.out.println("Sum is: "+sum);
		
		
		
	}
	

}
