package setProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program5 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		String str="IJK";
		System.out.println(str.hashCode());
		s.add("abc");s.add("PQR");s.add("xyz");s.add(str);
		System.out.println(s);
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
