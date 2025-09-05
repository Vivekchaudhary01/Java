package comparatorProgram;

import java.util.Comparator;

public class IDComparatorDescendingOrder implements Comparator<Employ>{
	
	public int compare(Employ e1, Employ e2) {
	return Integer.compare(e2.id, e1.id);
		//return e2.id-e1.id;
	}
}
