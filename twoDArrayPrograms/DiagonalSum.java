package twoDArrayPrograms;

public class DiagonalSum {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								{5, 10, 15, 20},
								 {2, 4, 6, 8},
								 {5, 10, 5, 5}};
		
		/*int[][] a= {{10, 20, 30},
					{40, 50, 60},
					{70, 80, 90}};*/
		int sum=getDiagonalSum(a);
		System.out.println("Sum is: "+sum);
		}
		
	public static int getDiagonalSum(int[][] a) {
		int rows=a.length, cols=a[0].length;
		if(rows!=cols) {
			System.out.println("ROws and cols must be same!");
			return 0;
		}
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i==j || i+j==rows-1)
					sum=sum+a[i][j];
			}
		}
	//return rows%2==0 ?sum:sum-a[rows/2][rows/2];
	return sum;
	}

}
