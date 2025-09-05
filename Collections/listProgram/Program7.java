package listProgram;

import java.util.ArrayList;
import java.util.*;

public class Program7 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(10);l1.add(50);
		l1.add(10);l1.add(60);
		ListIterator<Integer> lit=l1.listIterator();
		System.out.println("====Forward Access========");
		while(lit.hasNext())
			System.out.print(lit.next()+" ");
		System.out.println("\n====Backward Access========");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+" ");
		
	}

}
