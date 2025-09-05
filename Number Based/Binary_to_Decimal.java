import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n=sc.nextInt();
        System.out.println(Binary_to_Decimal(n));
    }
    public static int Binary_to_Decimal(int n){
        int decimal=0, i=0;
        while(n!=0){
            decimal+=(n%10)*Math.pow(2,i);
            n=n/10;
            i++;
        }
        return decimal;
    }
}
