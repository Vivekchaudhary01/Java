package mapPrograms;
import java.util.ArrayList;
import java.util.List;
public class Program15 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(12);l1.add(23);l1.add(43);l1.add(50);l1.add(33);
		System.out.println(l1);
		l1.replaceAll(n-> n%2==1?n+1:n );
		System.out.println(l1);
	}

}
