package mapPrograms;

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class UniqueWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String str=sc.nextLine();
		getUniqueWord(str);
	}
	public static void getUniqueWord(String str) {
		String[] s=str.split("\s+");
		Map<String, Integer> m=new HashMap<>();
		for(String p:s) {
			int val=m.getOrDefault(p, 0);
			m.put(p, val+1);
		}
		Set<String> keys=m.keySet();
		for(String x:keys) {
			if(m.get(x)==1)
				System.out.print(x+" ");
		}
	}
}
