/*
1	2	3	4	5
	6	7	8	9
		10	11	12
			13	14
				15
*/
import java.util.Scanner;

public class InverterNoTraingle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        InverterNoTraingle1(n);
    }   
    public static void InverterNoTraingle1(int n){
        int space=0,number=1,star=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=1;k<=star;k++)
                System.out.print(number++ +"\t");
            
            space++;star--;
            System.out.println();
        }
    }
}
