package comparableProgram;

public class Employ implements Comparable<Employ> {
	String name;
	int id;
	double salary;
	Employ(){
		
	}
	Employ(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String toString() {
	return "Name is: "+name+"\tID is: "+id+"\tSalary is: "+salary;
	}
	//Sorting on ID
	/*public int compareTo(Employ e) {
		return this.id-e.id;
	}*/
	//Sorting on Salary then on Name
	public int compareTo(Employ e) {
		if(this.salary==e.salary)
			return this.name.compareToIgnoreCase(e.name);
		return (int)(this.salary-e.salary);
	}
	//Sorting on name
	/*public int compareTo(Employ e) {
		return this.name.compareToIgnoreCase(e.name);
	}*/

}
