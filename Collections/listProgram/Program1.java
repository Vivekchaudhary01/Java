package listProgram;
import java.util.ArrayList;
import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(50); l1.add(40);l1.add(10);l1.add(50);
		l1.add(10);l1.add(60);
		System.out.println(l1);
		l1.add(1, 28);
		System.out.println(l1);
	}

}
