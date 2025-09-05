package arrayProgram;

public class Frequency3 {
	public static void main(String[] args) {
		int[] a= {12, 17, 12, 17, 18, 15, 12};
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int n=a.length-1;
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
		System.out.println(a[i]+" is: "+count+" times");
		}
	}

}
