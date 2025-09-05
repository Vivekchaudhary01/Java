// WAJP to print sum of all Odd numbers from 1 to 100.


public class q3 {
    public static void main(String[] args) {
        int n=2,sum=0;
        while (n<=100) {
            if(n%2!=0)
                sum+=n;
            n++;
        }
        System.out.println(sum);
    }  
}
