package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program37 {
	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<>();
		c1.add("40");c1.add("10");c1.add("20");c1.add("30");
		System.out.print(c1+" ");
		System.out.println();
		c1.stream().map(n->Integer.parseInt(n)).forEach(n->System.out.print(2*n+" "));	
	}


}
