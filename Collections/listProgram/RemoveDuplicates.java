package listProgram;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);l.add(18);l.add(12);l.add(20);l.add(30);l.add(40);l.add(12);
		System.out.println(l);
		l=removeDuplicates(l);
		System.out.println(l);
		
	}
	public static List<Integer> removeDuplicates(List<Integer> l){
		List<Integer> unique=new ArrayList<>();
			for(int p:l) {
				if(!unique.contains(p))
					unique.add(p);
			}
	return unique;
	}

}
