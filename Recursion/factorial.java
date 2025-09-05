// WAJP to calculate factorial by using recursion.
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
    public static int factorial(int n){
        if(n==2)
            return 2;
        else
            return n*factorial(n-1);
    }
}
