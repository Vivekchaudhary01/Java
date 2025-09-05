package mapPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Program9 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new TreeMap<>(Comparator.reverseOrder());
		m1.put("xyz", 36);
		m1.put("pqr", 45);
		m1.put("PQR", 70);
		m1.put("TUV", 90);
		m1.put("pqr", null);
		m1.put("ac", null);
		m1.put("ce", null);
		System.out.println(m1);
	}

}
