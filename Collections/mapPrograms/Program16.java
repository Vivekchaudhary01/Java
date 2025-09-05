package mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class Program16 {
	public static void main(String[] args) {
		Map<Integer, Integer> m=new HashMap<>();
		m.put(12, 3);m.put(34, 2);m.put(18, 4);m.put(20, 1);
		System.out.println(m);
		m.replaceAll((k,v)->k+v);
		System.out.println(m);
	
	}

}
