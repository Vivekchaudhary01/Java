package arrayProgram;

public class MinAnd2ndMin {
	public static void main(String[] args) {
		int[] a= {30, 30, 100, 100, 90, 100, 50, 100, 100};
		
		getMinAnd2ndMin(a);
		
	}
	public static void getMinAnd2ndMin(int[] a) {
		int min=a[0], secondMin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secondMin=min;
				min=a[i];
			}
			else if(a[i]<secondMin && a[i]!=min)
				secondMin=a[i];
		}
		System.out.println("Min is: "+min);
		System.out.println("Second Min is: "+secondMin);
	}

}
