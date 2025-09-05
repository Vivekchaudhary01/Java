package mapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharacterFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String str=sc.nextLine();
		getFrequency(str);
	}
	public static void getFrequency(String str) {
		Map<Character, Integer> m=new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			int v=m.getOrDefault(c, 0);
			m.put(c, v+1);
			//if(c!=' ') {
			//int v=m.getOrDefault(c, 0);
			//m.put(c, v+1);
			//}
		}
		m.forEach((k,v)->System.out.println(k+" is: "+v+" times"));

	}

}
