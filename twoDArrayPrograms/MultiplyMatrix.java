package twoDArrayPrograms;

public class MultiplyMatrix {
	public static void main(String[] args) {
		int[][] a= {{2, 4, 6},
					{3, 5, 4}};
		int[][] b= {{1, 3, 4},
					{2, 6, 3},
					{3, 5, 4}};
		int[][] c=multiply(a,b);
		printArray(a);
		System.out.println("=============");
		printArray(b);
		System.out.println("===============");
		printArray(c);
		
		}
	public static int[][] multiply(int[][] a, int[][] b){
		if(a[0].length!=b.length) {
			System.out.println("matrix multiplication is not possible!");
		return new int[][] {};
		}
		int[][] c=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				for(int k=0;k<a[0].length;k++)
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	return c;
	}
	public static void printArray(int[][] a) {
		for(int[] x:a) {
			for(int p:x)
				System.out.print(p+"\t");
		System.out.println();
		}
	}

}
