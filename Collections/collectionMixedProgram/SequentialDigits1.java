package collectionMixedProgram;

import java.util.Scanner;

public class SequentialDigits1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the min Point: ");
		int min=sc.nextInt();
		System.out.println("Enter the max Point: ");
		int max=sc.nextInt();
		printSequentialDigits(min, max);
	}
	public static void printSequentialDigits(int low, int high) {
		for(int i=1;i<9;i++) {
			int num=i;
			for(int j=i+1;j<=9;j++) {
				num=10*num+j;
				if(num>=low && num<=high)
				System.out.println(num);
			}
		}
		
	}

}
