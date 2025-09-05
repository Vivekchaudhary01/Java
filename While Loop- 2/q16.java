// WAJP to print the sum of below series:
// 1/1^2 + 1/2^2 + 1/3^2 + 1/4^2 .... upto 100.

public class q16 {
    public static void main(String[] args) {
        int n=1;
        double sum=0.0;
        while (n<=100) {
            sum+=(1.0/(n*n));
            n++;
        }
        System.out.println(sum);
    }      
}
