package mapPrograms;
import java.util.*;
public class Program19 {
	public static void main(String[] args) {
		Map<Integer, Integer> m=new LinkedHashMap<>();
		m.put(12, 3);m.put(34, 2);m.put(18, 4);m.put(20, 1);
		
		Set<Map.Entry<Integer, Integer>> ent=m.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr=ent.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> e=itr.next();
			System.out.println(e.getKey()+" is: "+e.getValue()+" times");
		}
		
	
	}

}
