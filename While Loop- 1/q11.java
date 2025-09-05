//WAJP to print a number is prime number or not.
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        System.out.print("Enter the number to check prime or not: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2,flag=0;
        while (i<n) {
            if(n%i==0){
                System.out.println(n+" is not a Prime Number.");
                flag++;
                break;
            }
            i++;
        }
        if (flag==0) {
            System.out.println(n+" is a Prime Number.");    
        }
        sc.close();
    }
}
