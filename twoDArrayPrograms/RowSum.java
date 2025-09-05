package twoDArrayPrograms;

public class RowSum {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								{50, 60, 70, 80},
								 {90, 100, 110, 120},
								 {43, 50, 70, 100}};
		int rows=a.length, cols=a[0].length;
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++)
				sum=sum+a[i][j];
		System.out.println("Sum of Row "+i+" is: "+sum);
		}
		
	}
}
