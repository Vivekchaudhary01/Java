
import java.util.Scanner;

public class Decimal_to_Octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n=sc.nextInt();
        System.out.println(Decimal_to_Octal(n));
    }
    public static int Decimal_to_Octal(int n){
        int octal=0,i=1;
        while(n!=0){
            octal+=(n%8)*i;
            n=n/8;
            i=i*10;
        }
        return octal;
    }
}
