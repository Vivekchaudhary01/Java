// WAJP to print sum of squares of all natural numbers from 1 to 100.
// 1^2+2^2+3^2+..... upto 100
public class q4 {
    public static void main(String[] args) {
        int n=1,sum=0;
        while (n<=100) {
            sum+=(n*n);
            n++;
        }
        System.out.println(sum);
    }    
}
