package mapPrograms;
import java.util.*;
public class Program17 {
	public static void main(String[] args) {
		Map<Integer, Integer> m=new LinkedHashMap<>();
		m.put(12, 3);m.put(34, 2);m.put(18, 4);m.put(20, 1);
		
		Set<Integer> keys=m.keySet();
		for(int k:keys) {
			System.out.println(k+" is: "+m.get(k)+" times");
		}
	
	}

}
