package listProgram;
import java.util.*;
public class LargestAndSmallestString {
	public static void main(String[] args) {
		Vector v;
		List<String> l=new ArrayList<>();
		l.add("mohan"); l.add("is");l.add("here");l.add("together");l.add("sohan");
		String largest=l.get(0), smallest=l.get(0);
		for(String p:l) {
			if(p.length()>largest.length())
				largest=p;
			else if(p.length()<smallest.length())
				smallest=p;
		}
		System.out.println("largest String : "+largest);
		System.out.println("smallest String : "+smallest);
		
		
	}

}
