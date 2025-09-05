import java.util.Scanner;

public class StroreNFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=1,j=0,count=0;
        while(i<n*50){
            a[j++]=fibonacciseries(i);
            count++;
            if(count==n)
                break;
            i++;
        }
        for(int k:a)
            System.out.print(k+" ");
    }
    public static int fibonacciseries(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacciseries(n-1)+fibonacciseries(n-2);
    }
}
