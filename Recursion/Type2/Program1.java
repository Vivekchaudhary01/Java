public class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int a=12,b=30,c=40,d=50, e=60;
		int result=add(add(add(a,b),c), add(d,e));
		System.out.println("Sum is: "+result);
		
	}
	public static int add(int n1, int n2){
	return n1+n2;
	}
}
