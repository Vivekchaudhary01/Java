package mapPrograms;

import java.util.LinkedHashMap;
import java.util.*;

public class Program8 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new IdentityHashMap<>();
		m1.put("xyz", 36);
		m1.put("abc", 50);
		m1.put("x", 38);
		m1.put("b", 53);
		m1.put("z", 36);
		m1.put("a", 50);
		m1.put("pqr", null);
		m1.put(null, null);
		m1.put(null, null);

		System.out.println(m1);
	}

}
