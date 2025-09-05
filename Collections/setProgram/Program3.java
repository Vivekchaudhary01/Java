package setProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		//Set<Integer> s=new TreeSet<>();
		Set<Integer> s=new TreeSet<>(Comparator.reverseOrder());
		s.add(58);s.add(60);s.add(45);s.add(34);s.add(50);s.add(45);s.add(70);
		System.out.println(s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
