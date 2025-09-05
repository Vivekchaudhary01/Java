package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program11 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(45);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		for(Integer p:c1) {
			if(p%2==1)
				c1.remove(p);
		}
		System.out.println(c1);
		
	}
}
