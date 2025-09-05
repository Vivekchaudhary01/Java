package collectionProgram;
import java.util.ArrayList;
import java.util.Collection;
public class Program6 {
		public static void main(String[] args) {
			Collection c1=new ArrayList();
			c1.add(12); c1.add(45);c1.add(32);c1.add(50);
			c1.add(52);c1.add(60);
			for(Object o:c1) {
				System.out.println(o);
			}
	}

}
