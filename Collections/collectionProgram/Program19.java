package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Program19 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(47);c1.add(33);c1.add(50);
		c1.add(52);c1.add(60);
		//Stream<Integer> st=c1.stream();
		c1.stream().forEach(n->System.out.print(n+" "));
		int count=(int)c1.stream().filter(n->n%2==0).count();
		System.out.println("\nTotal Even elements are: "+count);
		System.out.println();
		c1.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
	}

}
