package setProgram;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>(64, 0.85f);
		s.add(58);s.add(null);s.add(45);s.add(34);s.add(50);s.add(45);s.add(70);
		System.out.println(s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
