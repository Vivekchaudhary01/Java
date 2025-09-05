package twoDArrayPrograms;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the columns: ");
		int columns=sc.nextInt();
		int[][] a=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("Enter the Element: ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n====Entered Elements Are:======");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				//System.out.print(a[i][j]+"\t");
				System.out.printf("%-4d",a[i][j]);
			}
		System.out.println();
		}
	}
}
