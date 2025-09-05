package listProgram;
import java.util.*;
public class Program11 {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.ensureCapacity(1000);
		l1.add(12);l1.add(21);l1.add(30);
		l1.add(40);l1.add(31);l1.add(34);
		l1.add(44);l1.add(45);
		
		l1.removeIf(n->n%2==1);
		System.out.println(l1);
		
		
		ArrayList<Integer> l2=new ArrayList<>(1100);
		
		l2.trimToSize();
		List<Integer> l3=new ArrayList<>(l1);
		System.out.println(l1);
		System.out.println(l3);
		
		List l=l1.subList(2, 5);
		System.out.println(l);
	}

}
