package stringPrograms;

public class Program8 {
	public static void main(String[] args) {
		String s1="mohan and sohan and john"
				+ "\nand jack and mohan and sohan "
				+ "\nand rohan\n";
		System.out.println(s1.indent(5));
		System.out.println("====================");
		System.out.println(s1.repeat(5));
	}
}
