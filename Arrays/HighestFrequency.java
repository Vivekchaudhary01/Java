package arrayProgram;

public class HighestFrequency {
	public static void main(String[] args) {
		int[] a= {12, 17,12,  18, 18, 12, 17, 18, 15, 18, 12};
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int n=a.length-1, freq=1, elem=a[0];
		for(int i=0;i<=n;i++) {
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n];
					n--;
					j--;
				}
			}
			if(count>freq) {
				freq=count;
				elem=a[i];
			}
		}
		System.out.println("Element with Highest Frequency is: "+elem+" times: "+freq);
	}
	

}
