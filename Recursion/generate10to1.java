// WAJP to generate numbers from 10 to 1 by using recursion.
import java.util.Scanner;
public class generate10to1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==1){
            System.out.print(n + " ");
        }
        else{
            System.out.print(n + " ");
            printNumbers(n-1);
        }
    }
}
