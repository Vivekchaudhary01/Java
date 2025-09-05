import java.util.Scanner;
public class K
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
		int p=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=p;j++){
				if(j==1 || j==p)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		if(i<mid)
			p--; 
		else
			p++;
		System.out.println();
		}
	}
}
