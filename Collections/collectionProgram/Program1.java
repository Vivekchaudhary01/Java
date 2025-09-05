package collectionProgram;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println(c);
		c.add(12); c.add(34); c.add(12);
		c.add(23); c.add(5); c.add(33);
		System.out.println(c);
	
		Map m=new HashMap();
		m.put(12, "abc");	m.put(13, "pqr");
		System.out.println(m);
		
		
	}

}
