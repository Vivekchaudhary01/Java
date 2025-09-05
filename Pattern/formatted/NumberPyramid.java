/*
	         1
            1   1   2
        3  4   1   5   6 
   7   8  9   1  10 11  12



*/


import java.util.Scanner;
public class NumberPyramid
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Row: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int star=1,	space=n-1, num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.printf("%4s", " ");
			int numMid=star/2+1;
			for(int j=1;j<=star;j++){
				if(j==numMid)
					System.out.printf("%4d", 1);
				else
					System.out.printf("%4d",num++);
			}
		star+=2;		space--;
		System.out.println();
		}
	}
}
