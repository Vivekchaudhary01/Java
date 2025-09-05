public class Program2
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		printNum(10);
		System.out.println("Main Ends");
	}
	public static void printNum(int n){
		if(n>0){
			System.out.println(n);
			printNum(n-1);
		}
		else{
			System.out.println("Else block n is: "+n);
		}
	}
}
