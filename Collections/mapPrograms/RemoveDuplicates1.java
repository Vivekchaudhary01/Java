package mapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		int[] arr= {12, 18, 12, 16, 12, 18, 12, 17};
		Integer[] b=removeDuplicates(arr);
		for(int x:b)
			System.out.print(x+" ");
		//arr=new int[b.length];
		//int i=0;
		//for(int x:arr)
			//arr[i++]=x;
		
	}
	public static Integer[] removeDuplicates(int[] arr) {
		Map<Integer, Integer> m=new LinkedHashMap<>();
		for(int x:arr) {
			int v=m.getOrDefault(x, 0);
			m.put(x, v+1);
		}
		Integer[] b=m.keySet().toArray(new Integer[0]);
	return b;
	}

}
