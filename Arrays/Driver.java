package arrayProgram;

public class Driver {
	public static void main(String[] args) {
		Employ[] employees=new Employ[4];
		Employ e0=new Employ("Mohan", 123, 21, 35356.45);
		Employ e1=new Employ("Sohan", 120, 25, 45356.45);
		Employ e2=new Employ("Rohan", 183, 23, 55356.45);
		Employ e3=new Employ("ManMohan", 423, 28, 25356.45);
		employees[0]=e0;
		employees[1]=e1;
		employees[2]=e2;
		employees[3]=e3;
		System.out.println("====All Employees are Below=======");
		EmployService.getAllEmployees(employees);
		System.out.println("======Search Employee By ID============");
		EmployService.searchEmployById(employees);
		System.out.println("======Search Employee By Name============");
		EmployService.searchEmployByName(employees);
		
	}
	
	

}
