package queueProgram;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		ArrayDeque<Integer> q=new ArrayDeque<>(); 
		q.add(34);q.add(45);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
	}

}
