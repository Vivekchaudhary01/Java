import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Total Digits in "+n+" is: "+digitCount(n));
    }
    public static int digitCount(int n){
        if(n == 0)
            return 0;
        else
            return 1 + digitCount(n / 10);
    }
}
