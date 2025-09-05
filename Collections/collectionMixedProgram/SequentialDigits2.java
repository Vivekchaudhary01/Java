package collectionMixedProgram;

import java.util.*;

public class SequentialDigits2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the min Point: ");
		int min=sc.nextInt();
		System.out.println("Enter the max Point: ");
		int max=sc.nextInt();
		List<Integer> result=printSequentialDigits(min, max);
		for(int x:result)
			System.out.println(x);
	}
	public static List<Integer> printSequentialDigits(int low, int high) {
		List<Integer> l=new ArrayList<>();
		for(int i=1;i<9;i++) {
			int num=i;
			for(int j=i+1;j<=9;j++) {
				num=10*num+j;
				if(num>=low && num<=high)
					l.add(num);
			}
		}
		l.sort(Comparator.naturalOrder());
	return l;
	}

}
