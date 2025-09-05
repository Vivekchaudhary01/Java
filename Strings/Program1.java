package stringPrograms;

public class Program1 {
	public static void main(String[] args) {
		String s1="mohan";
		String s2=new String("mohan");
		String s3="mohan";
		String s4=new String("mohan");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println("================");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}

}
