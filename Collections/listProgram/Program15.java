package listProgram;
import java.util.*;
public class Program15 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(23);s.push(45);s.push(60);s.push(51);
		System.out.println(s);
		System.out.println("Element at top: "+s.peek());
		System.out.println(s.search(60));
		System.out.println(s.search(100));
		System.out.println(s.pop());
		
		
	}

}
