package collectionProgram;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12); c1.add(45);
		System.out.println(c1.add(12));
		Collection c2=new ArrayList();
		c2.add(18); c2.add(45); c2.add(60);
		c1.addAll(c2);
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);
	}

}
