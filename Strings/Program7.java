package stringPrograms;
import java.util.Scanner;
public class Program7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st name: ");
		String name1=sc.nextLine();
		System.out.println("Enter 2nd name: ");
		String name2=sc.nextLine();
		if(name1.compareToIgnoreCase(name2)<=0)
			System.out.println(name1+"\n"+name2);
		else
			System.out.println(name2+"\n"+name1);
	}

}
