package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program28 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(10); c1.add(48);c1.add(20);c1.add(50);
		c1.add(53);c1.add(60);c1.add(59);
		c1.stream().takeWhile(n->n%2==0).forEach(System.out::println);
	
		
		
	}

}
