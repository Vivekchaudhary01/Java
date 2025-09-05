package queueProgram;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortInDecreasingOrder {
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
		
		q.add(23);q.add(34);q.add(24);q.add(44);
		q.add(10);q.add(31);q.add(12);q.add(12);
		System.out.println("Sorted Elemenst are: ");
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}
	}

}
