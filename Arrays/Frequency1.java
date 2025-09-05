package arrayProgram;
//  0<=a[i]<=100
public class Frequency1 {
	
	public static void main(String[] args) {
		int[] a=new int[] {12, 34, 12, 20, 12, 34, 50, 10, 12, 10, 12, 34, 50, 60};
		getFrequency(a);
	}
	
	
	public static void getFrequency(int[] a) {
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0)
				System.out.println(i+" is: "+freq[i]+" times");
		}
	}

}
