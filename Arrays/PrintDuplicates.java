package arrayProgram;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] a=new int[] {12, 34, 12, 20, 12, 34, 50, 10, 12, 10, 12, 34, 50, 60};
		getDuplicates(a);
	}
	
	
	public static void getDuplicates(int[] a) {
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1)
				System.out.print(i+" ");
		}
	}

}
