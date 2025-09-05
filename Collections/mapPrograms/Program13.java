package mapPrograms;

import java.util.*;

public class Program13 {
	public static void main(String[] args) {
		Map<Integer, Integer> m=new HashMap<>();
		m.put(12, 3);m.put(34, 2);m.put(18, 4);m.put(20, 1);
	m.forEach((k,v)-> System.out.println(k+" is: "+v+" times"));
	}

}
