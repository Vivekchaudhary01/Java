package comparatorProgram;
import java.util.*;
public class IDComparatorAscendingOrder implements Comparator<Employ>{
	
	public int compare(Employ e1, Employ e2) {
		if(e1.id==e2.id)
			return e1.name.compareToIgnoreCase(e2.name);
	return e1.id-e2.id;
	}
	
	// (e1, e2)->e1.id-e2.id

}
