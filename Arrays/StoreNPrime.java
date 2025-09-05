import java.util.Scanner;

public class StoreNPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=2,count=0,j=0;
        while(i<=n*10){
            if(isPrime(i)){
                a[j++]=i;
                count++;
            }
            if(count==n)
                break;
            i++;
        }

        for(int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0)
            return false;
        for(int i=3;n>=i*i;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }    
}
