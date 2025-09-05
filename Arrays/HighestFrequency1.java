package arrayProgram;

public class HighestFrequency1 {
	public static void main(String[] args) {
		int[] a= {12, 20, 15, 20, 18, 15, 20, 15, 17, 12};
		 getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int maxFreq=1, elem=a[0];
		int min=a[0], max=a[0];
		for(int x:a) {
			if(x>max)
				max=x;
			if(x<min)
				min=x;
		}
		int[] freq=new int[max-min+1];
		for(int i=0;i<a.length;i++) {
			freq[a[i]-min]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=maxFreq) {
				maxFreq=freq[i];
				elem=i+min;
			}	
		}
	System.out.println("Element is: "+elem+" freq: "+maxFreq);
	}

}
