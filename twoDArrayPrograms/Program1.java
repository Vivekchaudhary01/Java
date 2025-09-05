package twoDArrayPrograms;

public class Program1 {
	public static void main(String[] args) {
		int[][] x= {{12, 34, 20, 40},
					{20, 21, 15, 60},
					{18, 31, 50, 80}};
		System.out.println(x.length);
		System.out.println(x[2][3]);
		System.out.println("======loop through 2-D Array===========");
		int rows=x.length, coulmns=x[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coulmns;j++) {
				System.out.print(x[i][j]+" ");
			}
		System.out.println();
		}
		}
}
