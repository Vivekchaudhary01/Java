/*
    	0 
   	  1 0 1 
  	2 1 0 1 2 
  3 2 1 0 1 2 3 
4 3 2 1 0 1 2 3 4 

*/


import java.util.Scanner;
public class NumberPyramid1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int star=1,	space=n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			int num=i-1, numMid=star/2+1;
			for(int j=1;j<=star;j++){
				System.out.print(num+" ");
				if(j<numMid)
					num--;
				else
					num++;
			}
		star+=2;		space--;
		System.out.println();
		}
	}
}
