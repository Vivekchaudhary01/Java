package collectionProgram;
//print all unique elements
import java.util.ArrayList;
import java.util.Collection;

public class Program24 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(48);c1.add(12);c1.add(50);
		c1.add(52);c1.add(60);c1.add(50);
		c1.stream().distinct().forEach(n->System.out.print(n+" "));
	
		
		
	}

}
