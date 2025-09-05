package listProgram;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(10);l1.add(50);
		l1.add(10);l1.add(60);
		System.out.println(l1);
		Object x=10;
		//l1.remove((Object)10);
		l1.remove(x);
		System.out.println(l1);
	}

}
