package twoDArrayPrograms;

public class AddMatrix {
	public static void main(String[] args) {
		int[][] a= {{10, 20},
					{5, 10}};
		int[][] b= {{50, 60},
					{40, 30}};
		int[][] c=addMatrix(a, b);
		printArray(c);
		}
	public static int[][] addMatrix(int[][] a, int[][] b){
		int row1=a.length, cols1=a[0].length;
		int row2=b.length, cols2=b[0].length;
		if(row1!=row2 || cols1!=cols2) {
			System.out.println("matrix sum is not possible!");
			int[][] c=new int[0][0];
		return c;
		}
		int[][] c=new int[row1][cols1];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<cols1;j++)
				c[i][j]=a[i][j]+b[i][j];
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
