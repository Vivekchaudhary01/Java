package arrayProgram;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a= {4, 2, 6, 4, 2, 4, 4, 8};
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void quickSort(int[] a, int low, int high) {
		if(low<high) {
			int pivot=divide(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
	}
	public static int divide(int[] a, int low, int high) {
		int mid=low+(high-low)/2;
		int pivot=a[mid];
		swap(a, mid, high);
		int i=low;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot)
				swap(a, i++, j);
		}
		swap(a, i, high);
	return i;
	}
	public static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
