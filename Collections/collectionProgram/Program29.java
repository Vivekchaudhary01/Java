package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program29 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(13); c1.add(47);c1.add(13);c1.add(50);
		c1.add(47);c1.add(60);c1.add(59);
		c1.stream().sorted().forEach(n->System.out.print(n+" "));
	
		
		
	}

}
