package comparableProgram;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(12);l1.add(23);l1.add(45);l1.add(15);
		l1.add(10);l1.add(12);
		System.out.println("Before SOrting: "+l1);
		Collections.sort(l1);
		System.out.println("After Sorting: "+l1);
	}

}
