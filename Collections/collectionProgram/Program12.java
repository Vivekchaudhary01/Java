package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program12 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		c1.forEach(n->System.out.print(n+" "));
		
	}
}
