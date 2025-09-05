package setProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(58);s.add(null);s.add(45);s.add(34);s.add(50);s.add(45);s.add(70);
		System.out.println(s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
