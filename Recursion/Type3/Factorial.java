public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int n=6;
		int result=getFactorial(n);
		System.out.println(n+"!= "+result);
		
	}
	public static int getFactorial(int n){
		if(n>1)
			return n*getFactorial(n-1);
		else
			return n;
	}
}
