public class Sum
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int n=100;
		int result=getSum(n);
		System.out.println("Sum is: "+result);
		
	}
	public static int getSum(int n){
		if(n>1)
			return n+getSum(n-1);
		else
			return n;
	}
}
