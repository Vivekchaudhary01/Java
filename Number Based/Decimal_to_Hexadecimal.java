import java.util.Scanner;

public class Decimal_to_Hexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n=sc.nextInt();
        System.out.println(Decimal_to_Hexadecimal(n));
    }
    public static int Decimal_to_Hexadecimal(int n){
        String hex="";
        while(n!=0){
            int rem=n%16;
            if(rem<10){
                hex=rem+hex;
            }else{
                char c=(char)(rem-10+'A');
                hex=c+hex;
            }
            n=n/16;
        }
        return Integer.parseInt(hex, 16);
    }
}
