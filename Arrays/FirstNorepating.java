package arrayProgram;

public class FirstNorepating {
	public static void main(String[] args) {
		int[] a= {12, 18, 12, 17,12, 15, 18, 12,15, 18, 17};
		int index=get1stNoRepeating(a);
		if(index>=0)
			System.out.println("Element is found at index: "+index);
		else
			System.out.println("First Non-repaeting elemnt dosen't exist!");
		
	}
	public static int get1stNoRepeating(int[] a) {
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
		for(int i=0;i<a.length;i++) {
			if(freq[a[i]-min]==1)
				return i;
		}
	return -1;
	}

}
