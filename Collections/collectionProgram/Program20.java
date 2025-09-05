package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Program20 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(47);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		Collection<Integer> p=c1.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(c1);
		System.out.println(p);
	}

}
