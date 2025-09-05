package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Program26 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(12); c1.add(48);c1.add(12);c1.add(50);
		c1.add(52);c1.add(60);c1.add(50);
		System.out.println("With Duplicates: "+c1);
		c1=c1.stream().distinct().collect(Collectors.toList());
		System.out.println("Without Duplicates: "+c1);
	
		
		
	}

}
