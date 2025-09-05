package comparableProgram;
import java.util.*;
public class EmployDriver {
	public static void main(String[] args) {
		List<Employ> l1=new ArrayList<>();
		l1.add(new Employ("Rohan", 123, 34654.56));
		l1.add(new Employ("Sohan", 103, 34054.56));
		l1.add(new Employ("Mohan", 163, 34654.56));
		l1.add(new Employ("John", 133, 24654.56));
		System.out.println("Before Sorting========");
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After Sorting ==========");
		Collections.sort(l1);
		for(Employ e:l1)
			System.out.println(e);
	}

}
