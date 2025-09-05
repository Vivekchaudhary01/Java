package arrayProgram;

import java.util.Scanner;

public class EmployService {
	
	public static void getAllEmployees(Employ[] e) {
		for(Employ p:e)
			System.out.println(p);
	}
	public static void searchEmployById(Employ[] e) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int id=sc.nextInt();
		for(Employ x:e) {
			if(x.id==id) {
				System.out.println("Employee is Found: "+x);
				return;
			}
		}
		System.out.println("Employ with ID: "+id+" is NOT Found!!");
	}
	public static void searchEmployByName(Employ[] e) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		for(Employ x:e) {
			if(x.name.equalsIgnoreCase(name)) {
				System.out.println("Employee is Found: "+x);
				return;
			}
		}
		System.out.println("Employ with name: "+name+" is NOT Found!!");
	}

}






