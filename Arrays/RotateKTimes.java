package arrayProgram;

import java.util.Scanner;

public class RotateKTimes {
	public static void main(String[] args) {
		int[] a= {10, 20, 30, 40, 50, 60, 70, 80, 90};
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nENter the rotaion value: ");
		int k=sc.nextInt();
		rightRotateKTimes(a, k);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void rightRotateKTimes(int [] nums, int k) {
	   k=k%nums.length;
       if(k==0)
            return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++; end--;
        }
    }

}
