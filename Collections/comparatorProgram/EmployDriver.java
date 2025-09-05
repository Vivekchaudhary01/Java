package comparatorProgram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployDriver {
	public static void main(String[] args) {
		List<Employ> l1=new ArrayList<>();
		l1.add(new Employ("Rohan", 123, 34654.56));
		l1.add(new Employ("Sohan", 103, 34054.56));
		l1.add(new Employ("ZMohan", 163, 34654.56));
		l1.add(new Employ("John", 133, 24654.56));
		System.out.println("Before Sorting========");
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After Sorting oN ID Ascending Order ==========");
		Collections.sort(l1, new IDComparatorAscendingOrder());
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After Sorting oN ID Descending Order ==========");
		Collections.sort(l1, new IDComparatorDescendingOrder());
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After *****Sorting oN Salary Descending Order ==========");
		//Collections.sort(l1, (e1, e2)->(int)(e1.salary-e2.salary));
		Collections.sort(l1, Comparator.comparing((Employ e)->e.salary).thenComparing(e->e.name));   
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After Sorting oN Salary Descending Order ==========");
		Collections.sort(l1, (e1, e2)->Double.compare(e2.salary, e1.salary));
		for(Employ e:l1)
			System.out.println(e);
		System.out.println("After Sorting oN Name Ascending Order ==========");
		Collections.sort(l1, Comparator.comparing((Employ e)->e.name));
		for(Employ e:l1)
			System.out.println(e);
	}

}
