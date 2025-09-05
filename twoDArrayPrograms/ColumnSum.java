package twoDArrayPrograms;

public class ColumnSum {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								{50, 60, 70, 80},
								 {90, 100, 110, 120},
								 {40, 50, 70, 100}};
		int rows=a.length, cols=a[0].length;
		for(int i=0;i<cols;i++) {
			int sum=0;
			for(int j=0;j<rows;j++)
				sum=sum+a[j][i];
		System.out.println("Sum of col: "+i+" is: "+sum);
		}
	}

}
