package stringPrograms;

public class Program6 {
	public static void main(String[] args) {
		String s1=new String("abc");
		s1.intern();
		String s2="abc";
		System.out.println(s1==s2);
		s1=s1.intern();
		System.out.println(s1==s2);
		
	}

}
