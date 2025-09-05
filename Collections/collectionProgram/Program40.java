package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.OptionalDouble;

public class Program40 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(50); c1.add(40);c1.add(10);c1.add(50);
		c1.add(10);c1.add(60);c1.add(50);
		System.out.print(c1+" ");
		System.out.println();
		//OptionalDouble avg=c1.stream().mapToInt(n->n).average();
		//System.out.println("Average is: "+avg.getAsDouble());
		double avg=c1.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println("Average is: "+avg);
		
		
		
		
	}

}
