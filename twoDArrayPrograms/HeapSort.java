package twoDArrayPrograms;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {12, 20, 10, 16, 14, 8, 11, 28};
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
		System.out.println();
		heapSort(a);
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
		
	}
	public static void heapSort(int[] a) {
		int n=a.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(a, n,i);
		for(int i=n-1;i>=0;i--) {
			swap(a, 0, i);
			heapify(a, i, 0);
		}
	}
	public static void heapify(int[] a, int n, int i) {
		int largest=i, left=2*i+1, right=2*i+2;
		if(left<n && a[left]>a[largest])
			largest=left;
		if(right<n && a[right]>a[largest])
			largest=right;
		if(i!=largest) {
			swap(a, i, largest);
			heapify(a, n, largest);
		}	
	}
	public static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
