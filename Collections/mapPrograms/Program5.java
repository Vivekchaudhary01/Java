package mapPrograms;

import java.util.IdentityHashMap;
import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new TreeMap<>();
		String s1="Mohan";
		String s2="Mohan";
		String s3=new String("Mohan");
		String s4=new String("Mohan");
		m1.put("xyz", 36);
		m1.put("pqr", 45);
		m1.put(s1, 100);
		m1.put(s2, 200);
		m1.put(s3, 300);
		m1.put(s4, 400);
		System.out.println(m1);
	}


}
