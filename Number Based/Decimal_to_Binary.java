import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n=sc.nextInt();
        System.out.println(Decimal_to_Binary(n));
    }
    public static int Decimal_to_Binary(int n){
        int binary=0, i=1;
        while(n!=0){
            binary+=(n%2)*i;
            n=n/2;
            i=i*10;
        }
        return binary;
    }
}
