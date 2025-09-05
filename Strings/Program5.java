package stringPrograms;

public class Program5 {
	public static void main(String[] args) {
		String s1=new String("mohan");
		String s2=new String("sohan").intern();
		String s3="mohan";
		String s4="sohan";
		System.out.println(s1==s3);
		System.out.println(s2==s4);
	}

}
