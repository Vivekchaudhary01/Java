package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program32 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(520); c1.add(470);c1.add(130);c1.add(5000);
		c1.add(47);c1.add(60);c1.add(59);
		System.out.print(c1+" ");
		System.out.println();
		c1.stream().map(n->n.byteValue()).forEach(n->System.out.print(n+" "));
		
		
		
	}

}
