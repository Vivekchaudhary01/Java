package twoDArrayPrograms;

public class CheckTranspose {
	public static void main(String[] args) {
		int[][] a= {{10, 20, 30},
					{5, 10, 15}};
		int[][] b= {{10, 5},
					{20, 10},
					{30, 15}};
		if(isTranspose(a, b))
			System.out.println("It is Transpose!");
		else
			System.out.println("It is not Transpose");
		
		}
	public static boolean isTranspose(int[][] a, int[][] b) {
		int rows1=a.length, cols1=a[0].length;
		int rows2=b.length, cols2=b[0].length;
		if(rows1!=cols2 || cols1!=rows2)
			return false;
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				if(a[i][j]!=b[j][i])
					return false;
			}
		}
	return true;
	}
}



