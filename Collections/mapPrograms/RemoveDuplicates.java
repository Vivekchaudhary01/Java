package mapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr= {12, 18, 12, 16, 12, 18, 12, 17};
		arr=removeDuplicates(arr);
		for(int x:arr)
			System.out.print(x+" ");
	}
	public static int[] removeDuplicates(int[] arr) {
		Map<Integer, Integer> m=new LinkedHashMap<>();
		for(int x:arr) {
			int v=m.getOrDefault(x, 0);
			m.put(x, v+1);
		}
		int i=0;
		int[] b=new int[m.size()];
		for(int x:m.keySet())
			b[i++]=x;
	return b;
	}

}
