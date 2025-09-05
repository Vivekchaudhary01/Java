package arrayProgram;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] x=new int[10];
		for(int i=0;i<x.length;i++) {
			System.out.println("ENter the Element "+(i+1)+": ");
			x[i]=sc.nextInt();
		}
		
		System.out.println("===All elements are===");
		for(int p:x)
			System.out.print(p+" ");
	}

}
