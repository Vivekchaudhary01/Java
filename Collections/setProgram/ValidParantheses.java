package setProgram;
import java.util.*;
public class ValidParantheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression: ");
		String exp=sc.nextLine();
		if(isValid(exp))
			System.out.println("Expression is Valid!!");
		else
			System.out.println("Expression is Invalid!!");
	}
	public static boolean isValid(String exp) {
		String op="({[";
		String clo=")}]";
		Stack<Character> s=new Stack<>();
		for(char c:exp.toCharArray()) {
			if(op.indexOf(c)>=0)
				s.push(c);
			else if(clo.indexOf(c)>=0) {
				if(s.isEmpty())
					return false;
				else if(op.indexOf(s.pop())!=clo.indexOf(c))
					return false;
			}
		}
	return s.isEmpty();
	}

}





