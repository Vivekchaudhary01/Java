package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.OptionalDouble;

public class Program45 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(50); c1.add(40);c1.add(10);c1.add(50);
		c1.add(10);c1.add(60);c1.add(50);
		System.out.print(c1+" ");
		System.out.println();
		int max=c1.stream().max((a,b) -> a-b).get();
		System.out.println("max is: "+max);
		int min=c1.stream().min((a,b)->a-b).get();
		System.out.println("min is: "+min);	
	}

}
