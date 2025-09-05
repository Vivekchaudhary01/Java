import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of powers a^b: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Power of "+a+" ^ "+b+" is: "+power(a,b));
    }
    public static int power(int a,int b){
        if(b==1)
            return a;
        else 
            return a*power(a, b-1);
    }
}
