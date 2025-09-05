package arrayProgram;

public class Frequency2 {
	public static void main(String[] args) {
		int[] a= {12, 20, 12, 20, 18, 12, 20, 15, 17, 12};
		 getFrequency(a);
	}
	public static void getFrequency(int[] a) {
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
			if(freq[i]!=0)
				System.out.println(i+min+" is: "+freq[i]+" times");
		}
		
	}

}






