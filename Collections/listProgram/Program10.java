package listProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program10 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(11);l1.add(50);
		l1.add(10);l1.add(60);
		System.out.println(l1);
		ListIterator<Integer> lit=l1.listIterator(l1.size());
		
		while(lit.hasPrevious()) {
			//int n=lit.next();
			if(lit.previous()%2==1)
				lit.remove();
		}
		System.out.println(l1);
	}
}
