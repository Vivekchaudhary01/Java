// WAJP to print all the factors of a number.(number itself excluded)
// i/p: 28
// o/p: 1	2	4	7	14
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        System.out.print("Enter the number for factors: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        System.out.println("Factors are: ");
        while(i<n){
            if(n%i==0)
                System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}
