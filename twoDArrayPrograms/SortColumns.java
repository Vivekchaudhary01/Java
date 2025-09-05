package twoDArrayPrograms;

public class SortColumns {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 18, 40},
								{15, 10, 5, 20},
								 {2, 4, 6, 8},
								 {5, 10, 5, 5}};
		printArray(a);
		a=sortColumns(a);
		System.out.println("====================");
		printArray(a);
	}
	public static int[][] sortColumns(int[][] a) {
		a=transpose(a);
		for(int[] x:a) {
			sort(x);
		}
		a=transpose(a);
	return a;
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int ind=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[ind]) {
					ind=j;
				}
			}
			int temp=a[i];
			a[i]=a[ind];
			a[ind]=temp;	
		}
	}
	public static int[][] transpose(int[][] a) {
		int rows=a.length, cols=a[0].length;
		int[][] b=new int[cols][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				b[j][i]=a[i][j];
		}
	return b;
	}
	public static void printArray(int[][] a) {
		for(int[] x:a) {
			for(int p:x)
				System.out.print(p+"\t");
		System.out.println();
		}
	}

}
