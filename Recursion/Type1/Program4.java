public class Program4
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		printNum(1);
		System.out.println("Main Ends");
	}
	public static void printNum(int n){
		if(n<=10){
			printNum(n+1);
		}
	System.out.println(n);
	}
}
