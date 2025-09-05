// WAJP to print the sum of below series:
// 1/1*2 + 1/2*3 + 1/3*4 + 1/4*5 .... upto 100.

public class q18 {
    public static void main(String[] args) {
        int n=1;
        double sum=0.0;
        while (n<=100) {
            sum+=(1.0/(n*(n+1)));
            n++;
        }
        System.out.println(sum);
    } 
}
