package collectionProgram;

import java.util.Arrays;

public class Program25 {
	public static void main(String[] args) {
		int[] a= {12, 23, 12, 40, 12, 23, 34, 12, 34};
		Arrays.stream(a).distinct().forEach(n->System.out.print(n+" "));
	}

}
