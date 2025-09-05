package collectionProgram;

import java.util.ArrayList;
import java.util.Collection;

public class Program7 {
	public static void main(String[] args) {
		Object o1=12;
		System.out.println((Integer)o1+100);
			Collection c1=new ArrayList();
			c1.add(12); c1.add(45);c1.add(32);c1.add(50);
			c1.add(52);c1.add(60); c1.add("abc");c1.add(true);
			int sum=0;
			for(Object o:c1) {
				sum=sum+(Integer)o;
			}
			System.out.println("Sum is: "+sum);
	}

}
