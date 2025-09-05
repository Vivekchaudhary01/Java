package collectionMixedProgram;

public class SequentialDigits {
	public static void main(String[] args) {
		printSequentialDigits();
	}
	public static void printSequentialDigits() {
		for(int i=1;i<9;i++) {
			int num=i;
			for(int j=i+1;j<=9;j++) {
				num=10*num+j;
				System.out.println(num);
			}
		}
		
	}

}
