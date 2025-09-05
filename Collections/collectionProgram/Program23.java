package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program23 {
	public static void main(String[] args) {
			Collection<Integer> c1=new ArrayList<>();
			c1.add(13); c1.add(47);c1.add(37);c1.add(50);
			c1.add(52);c1.add(60);
			boolean result=c1.stream().anyMatch(n->n%2==0);
			System.out.println(result);
			
			
	}

}
