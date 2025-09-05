package queueProgram;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		//Integer i;
		//Double d;
		//String s;
		//Queue<Task> q=new PriorityQueue<>(Comparator.comparingInt((Task t)->t.days));
		//Queue<Task> q=new PriorityQueue<>(Comparator.comparingInt((Task t)->t.workers)); 
	//	Queue<Task> q=new PriorityQueue<>(Comparator.comparingDouble((Task t)->t.amount).reversed()); 
		Queue<Task> q=new PriorityQueue<>(Comparator.comparing((Task t)->t.name.toLowerCase()));          
		q.add(new Task("a", 12, 50, 123444.34));
		q.add(new Task("E", 18, 40, 103444.34));
		q.add(new Task("C", 10, 55, 223444.34));
		q.add(new Task("B", 10, 58, 273444.34));
		System.out.println("=====================");
		//System.out.println(q);
		while(!q.isEmpty())
			System.out.println(q.remove());
	}

}
