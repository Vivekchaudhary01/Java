package twoDArrayPrograms;

public class SortRows {
	public static void main(String[] args) {
		int[][] a=new int[][]{{10, 20, 18, 40},
								{15, 10, 5, 20},
								 {2, 4, 6, 8},
								 {5, 10, 5, 5}};
		printArray(a);
		sortRows(a);
		System.out.println("====================");
		printArray(a);
	}
	public static void sortRows(int[][] a) {
		for(int[] x:a) {
			sort(x);
		}
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
	public static void printArray(int[][] a) {
		for(int[] x:a) {
			for(int p:x)
				System.out.print(p+"\t");
		System.out.println();
		}
	}

}
