package twoDArrayPrograms;

public class Transpose {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								 {50, 60, 70, 80},
								 {90, 100, 110, 120}};
		int[][] b=transpose(a);
		int row1=a.length, col1=a[0].length;
		System.out.println("\n====Original Elements Are:======");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				//System.out.print(a[i][j]+"\t");
				System.out.printf("%-4d",a[i][j]);
			}
		System.out.println();
		}
		int row2=b.length, col2=b[0].length;
		System.out.println("\n====Transposed Elements Are:======");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				//System.out.print(a[i][j]+"\t");
				System.out.printf("%-4d",b[i][j]);
			}
		System.out.println();
		}
								 
		
		}
	public static int[][] transpose(int[][] a) {
		int rows=a.length, columns=a[0].length;
		int[][] b=new int[columns][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				b[j][i]=a[i][j];
			}
		}
	return b;
	}

}
