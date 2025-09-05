package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program22 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(48);c1.add(36);c1.add(50);
		c1.add(52);c1.add(60);
		boolean result=c1.stream().allMatch(n->n%2==0);
		System.out.println(result);
		
		
	}
}
