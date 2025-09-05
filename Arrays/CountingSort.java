package arrayProgram;
import java.util.Arrays;
public class CountingSort {
	public static void main(String[] args) {
		int[] a= {4, 2, 6, 4, 2, 4, 4, 8};
		System.out.println(Arrays.toString(a));
		countingSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void countingSort(int[] a) {
		int min=a[0], max=a[0];
		for(int x:a) {
			if(x<min)
				min=x;
			else if(x>max)
				max=x;
		}
		int[] freq=new int[max-min+1];
		for(int x:a)
			freq[x-min]++;
		for(int i=0, ind=0;i<freq.length;i++) {
			while(freq[i]>0) {
				a[ind++]=i+min;
			freq[i]--;
			}
		}
		
		
	}

}
