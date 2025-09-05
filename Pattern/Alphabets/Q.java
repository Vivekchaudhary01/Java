import java.util.Scanner;
public class Q 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Row: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("Pattern can't be generated for this n");
			return;
		}	
		int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
	if(j==1 && i<n ||i==1 && j<n ||i==n-1 && j<n || j==n-1 && i<n ||i==j && i>=mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}
