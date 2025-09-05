package queueProgram;

public class Task{
	String name;
	int days;
	int workers;
	double amount;
	Task(){
		
	}
	Task(String name, int days, int workers, double amount){
		this.name=name;
		this.days=days;
		this.workers=workers;
		this.amount=amount;
	}
	public String toString() {
	return "Name: "+name+"\tDays: "+days+"\tWorkers: "+workers+"\tAmount: "+amount;
	}

}
