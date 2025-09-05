package mapPrograms;
import java.util.*;
public class Frequency {
	public static void main(String[] args) {
		int[] arr= {12, 18, 12, 16, 12, 18, 12, 17};
		Map<Integer, Integer> m=new LinkedHashMap<>();
		for(int x:arr) {
			int v=m.getOrDefault(x, 0);
			m.put(x, v+1);
		}
		m.forEach((k,v)->System.out.println(k+" is: "+v+" times"));
	}

}
