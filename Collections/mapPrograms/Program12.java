package mapPrograms;

import java.util.*;

public class Program12 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);l.add(34);l.add(100);l.add(38);
		l.forEach(n->System.out.print(n*2+" "));
	}

}
