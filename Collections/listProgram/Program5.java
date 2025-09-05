package listProgram;

import java.util.ArrayList;
import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(10);l1.add(50);
		l1.add(10);l1.add(60);
		l1.add(null);
		l1.add(7, 100);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
	}

}
