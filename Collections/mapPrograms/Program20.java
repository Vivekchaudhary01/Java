package mapPrograms;

import java.util.*;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer, Integer> m=new LinkedHashMap<>();
		m.put(12, 3);m.put(34, 2);m.put(18, 4);m.put(20, 1);
		System.out.println("before: "+m);
		System.out.println("ENter the number: ");
		int n=sc.nextInt();
		int v=m.getOrDefault(n, 0);
		m.put(n, v+1);
		System.out.println("After :"+m);
		
		
		
	}

}
