package mapPrograms;

import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Map m1=new HashMap<>();
		m1.put(12, 34);
		m1.put(12.9, 34.8);
		m1.put(18, "abc");
		m1.put("xyz", 36);
		m1.put("abc", "cde");
		m1.put(18, 100);
		System.out.println(m1);
	}

}
