package mapPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.*;

public class Program11 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new Hashtable<>();
		m1.put("xyz", 36);
		m1.put("pqr", 45);
		m1.put("PQR", 70);
		m1.put("TUV", 90);
		m1.put("pqr", 88);
		m1.put("ac", 86);
		m1.put("ce", 76);
		System.out.println(m1);
	}

}
