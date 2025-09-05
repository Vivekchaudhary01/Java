package twoDArrayPrograms;

public class Doagonal0 {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								 {50, 60, 70, 80},
								 {90, 100, 110, 120},
								 {43, 50, 70, 100}};
		makeDiagonalZero(a);
		int row1=a.length, col1=a[0].length;
		System.out.println("\n====Original Elements Are:======");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				//System.out.print(a[i][j]+"\t");
				System.out.printf("%-4d",a[i][j]);
			}
		System.out.println();
		}						 
		
		}
	public static void makeDiagonalZero(int[][] a) {
		int rows=a.length, columns=a[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(i+j==a.length-1)
					a[i][j]=0;
					
			}
		}
	}

}
