public class Table
{
	public static void main(String[] args)
	{
		printTable(45, 1);
	}
	public static void printTable(int n, int i){
		if(i<=10){
			System.out.println(n+"*"+i+"= "+n*i);
			printTable(n, i+1);
		}
	}
}
