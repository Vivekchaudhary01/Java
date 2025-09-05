package mapPrograms;
import java.util.*;
import java.util.Scanner;
public class WordFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String str=sc.nextLine();
		getWordFrequency(str);
	}
	public static void getWordFrequency(String str) {
		String[] s=str.split("\s+");
		Map<String, Integer> m=new HashMap<>();
		for(String p:s) {
			int val=m.getOrDefault(p, 0);
			m.put(p, val+1);
		}
		m.forEach((k,v)->System.out.println(k+" is: "+v+" times"));
	}

}




