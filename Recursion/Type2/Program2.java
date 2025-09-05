public class Program2
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int a=12,b=80,c=40,d=99, e=60;
		int result=big(big(big(a,b),c), big(d,e));
		System.out.println("Biggest Number is: "+result);
		
	}
	public static int big(int n1, int n2){
	return n1>n2?n1:n2;
	}
}
