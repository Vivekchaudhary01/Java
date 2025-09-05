package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program36 {
	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<>();
		c1.add("mohan");c1.add("john");c1.add("mark");c1.add("sohan");
		System.out.print(c1+" ");
		System.out.println();
		c1.stream().map(n->n.length()).forEach(n->System.out.print(n+" "));	
	}

}
