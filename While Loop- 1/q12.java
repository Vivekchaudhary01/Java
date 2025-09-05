// WAJP to print all the terms of Fibonacci series up to n.
// i/p: 7
// Output: 0 1 1 2 3 5 8
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        System.out.print("Enter the number upto which Fibonacci will be print: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1) {
            System.out.println("0");
        }
        else{
            int current=1,prev=0,i=2;
            System.out.print(prev+" "+current+" ");
            while(i<=n){
                int sum=prev+current;
                System.out.print(sum+" ");
                prev=current;
                current=sum;
                i++;
            }
        }
        sc.close();
    }    
}
