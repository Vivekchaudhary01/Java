package listProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program8 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(10);l1.add(50);
		l1.add(10);l1.add(60);
		ListIterator<Integer> lit=l1.listIterator(l1.size());
		System.out.println("====Backward Access========");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+" ");
		
	}
	

}
