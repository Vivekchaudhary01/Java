package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12); c1.add(45);c1.add(32);c1.add(50);
		System.out.println("size is: "+c1.size());
		System.out.println("Before Removing: "+c1);
		System.out.println(c1.remove(45));
		System.out.println(c1.remove(100));
		System.out.println("After Removing: "+c1);
		
	}

}
