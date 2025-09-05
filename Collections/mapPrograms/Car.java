package mapPrograms;

import java.util.Objects;

public class Car {
	String name;
	String color;
	double price;
	Car(){
		
	}
	Car(String name, String color, double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+" "+price+" "+color;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		else if(obj==null || getClass()!=obj.getClass())
			return false;
		Car c=(Car)obj;
	return name.equalsIgnoreCase(c.name) && color.equalsIgnoreCase(c.color)&& price==c.price;
	}
	@Override
	public int hashCode() {
	return Objects.hash(name, color, price);
	}

}
