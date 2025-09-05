import java.util.Scanner;
public class V
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Row: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		if((n/2+1+1)%2==0){
			System.out.println("Pattern can't be generated for this n");
			return;
		}	
		int mid=n/2+1;
		int p=1, q=n;
		for(int i=1;i<=n;i+=2){
			for(int j=1;j<=q;j++){
				if(j==p || j==q)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		p++; q--;
		System.out.println();
		}
	}
}
