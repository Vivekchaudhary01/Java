package mapPrograms;
import java.util.*;
public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("TATA", "White", 23456.7);
		Car c2=new Car("TATA", "White", 23456.7);
		Car c3=new Car("TATA", "White", 23456.7);
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		Map<Car, Integer> hm=new HashMap<>();
		Map<Car, Integer> ihm=new IdentityHashMap<>();
		hm.put(c1, 1);hm.put(c2, 2);hm.put(c3, 3);
		ihm.put(c1, 1);ihm.put(c2, 2);ihm.put(c3, 3);
		System.out.println(hm);
		System.out.println(ihm);
		
	}

}
