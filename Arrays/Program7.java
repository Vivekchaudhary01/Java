package arrayProgram;

import java.util.Arrays;

public class Program7 {
	public static void main(String[] args) {
		int[] a= {10, 12, 18, 20, 30};
		int index=Arrays.binarySearch(a, 19);
		System.out.println("Index is: "+index);
	}

}
