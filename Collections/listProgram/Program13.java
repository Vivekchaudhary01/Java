package listProgram;

import java.util.ArrayList;
import java.util.Comparator;

public class Program13 {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(12);l1.add(21);l1.add(30);
		l1.add(40);l1.add(31);l1.add(34);
		l1.add(44);l1.add(45);
		
		l1.sort(Comparator.reverseOrder());
		System.out.println(l1);
		
	}

}
