package setProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program4 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		Integer x=45;
		System.out.println(x.hashCode());
		s.add(x);s.add(40);s.add(45);s.add(34);s.add(50);s.add(45);s.add(70);
		System.out.println(s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
	

}
