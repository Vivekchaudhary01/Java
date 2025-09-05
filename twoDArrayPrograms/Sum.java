package twoDArrayPrograms;

public class Sum {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 30, 40},
								{50, 60, 70, 80},
								 {90, 100, 110, 120},
								 {43, 50, 70, 100}};
		int sum=0, rows=a.length, cols=a[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				sum=sum+a[i][j];
		}
		System.out.println("Total Sum is: "+sum);
								 
								 
								 
	}

}
