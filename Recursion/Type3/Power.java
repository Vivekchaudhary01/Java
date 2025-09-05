public class Power
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int a=6;
		int b=4;
		int result=getPower(a, b);
		System.out.println(a+" to power "+b+" is: "+result);
		
	}
	public static int getPower(int a, int b){
		if(b>1)
			return a*getPower(a, b-1);
		else
			return a;
	}
}
