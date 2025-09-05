package mapPrograms;

import java.util.HashMap;
import java.util.*;

public class Program7 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new LinkedHashMap<>();
		m1.put("xyz", 36);
		m1.put("pqr", null);
		m1.put(null, null);
		m1.put(null, null);

		System.out.println(m1);
	}

}
