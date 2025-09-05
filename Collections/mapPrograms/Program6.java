package mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class Program6 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new HashMap<>();
		m1.put("xyz", 36);
		m1.put("pqr", null);
		m1.put(null, null);
		m1.put(null, null);

		System.out.println(m1);
	}

}
