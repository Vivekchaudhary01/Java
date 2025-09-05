package listProgram;
import java.util.*;
public class LListProgram1 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(34);l1.add(45);l1.add(50);
		System.out.println(l1);
		Iterator<Integer> itr=l1.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
