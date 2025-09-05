package comparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Mohan");l1.add("abc");l1.add("PQR");l1.add("ccd");
		System.out.println("Before SOrting: "+l1);
		Collections.sort(l1);
		System.out.println("After Sorting: "+l1);
	}

}
