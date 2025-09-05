package collectionProgram;

import java.util.Arrays;

public class Program44 {
	public static void main(String[] args) {
		int[] a= {12, 23, 12, 34, 20, 12, 20, 21};
		a=Arrays.stream(a).distinct().toArray();
		
		for(int x:a)
			System.out.print(x+" ");
	}

}
