package listProgram;
import java.util.*;
public class Program14 {
	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<>();
		v1.add(23);v1.add(45);v1.add(56);v1.add(33);
		System.out.println(v1);
		
		Enumeration<Integer> en=v1.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
