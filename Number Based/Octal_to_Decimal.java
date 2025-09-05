import java.util.Scanner;

public class Octal_to_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an octal number: ");
        String n=sc.nextLine();
        System.out.println(Octal_to_Decimal(n));
    }
    // public static int Octal_to_Decimal(int n){
    //     int decimal=0, i=0;
    //     while(n!=0){
    //         decimal+=(n%10)*Math.pow(8,i);
    //         n=n/10;
    //         i++;
    //     }
    //     return decimal;
    // }
    // if input is string
     public static String Octal_to_Decimal(String n){
         int dec=0,base=1;
         for(int i=n.length()-1;i>=0;i--){
             char c=n.charAt(i);
             if(c>='7'&&c<='0')
                 return "Invalid Input";
             dec=dec+(c-'0')*base;           
             base*=8;
         }
         return dec+"";
     }
    
}
