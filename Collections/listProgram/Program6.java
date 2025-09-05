package listProgram;

import java.util.ArrayList;
import java.util.List;

public class Program6 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(47);l1.add(10);l1.add(55);
		l1.add(10);l1.add(60);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			if(l1.get(i)%2==1)
				l1.remove(i);
		}
		System.out.println(l1);
	}
}
