package twoDArrayPrograms;

public class ReverseRows {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								{5, 10, 15, 20},
								 {2, 4, 6, 8},
								 {5, 10, 5, 5}};
		
		/*int[][] a= {{10, 20, 30},
					{40, 50, 60},
					{70, 80, 90}};*/
		printArray(a);
		reverseRows(a);
		System.out.println("====================");
		printArray(a);
		
		}
	public static void printArray(int[][] a) {
		for(int[] x:a) {
			for(int p:x)
				System.out.print(p+"\t");
		System.out.println();
		}
	}
	public static void reverseRows(int[][] a) {
		int rows=a.length, cols=a[0].length;
		for(int i=0;i<rows;i++) {
			int start=0, end=cols-1;
			while(start<end) {
				int temp=a[i][start];
				a[i][start]=a[i][end];
				a[i][end]=temp;
			start++; end--;
			}
		}
		
		
	}

}




