package arrayProgram;

public class Biggest2ndBiggest {
	public static void main(String[] args) {
		int[] a= {100, 100, 100, 100, 100, 100, 100, 100, 100};
		getBiggestAnd2ndBiggest(a);
		
	}
	public static void getBiggestAnd2ndBiggest(int[] a) {
		int max=a[0], secondMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax && a[i]!=max)
				secondMax=a[i];
		}
		System.out.println("Max is: "+max);
		if(secondMax!=Integer.MIN_VALUE)
			System.out.println("Second Max is: "+secondMax);
		else
			System.out.println("Second Max is: "+max);
	}

}
