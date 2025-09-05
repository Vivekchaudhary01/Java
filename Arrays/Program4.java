package arrayProgram;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		String[] p= {"Even", "Odd"};
		System.out.println(n+" is: "+p[n%2]);
	}

}
