// WAJP to print the sum of below series:
// 1/1 + 1/3 + 1/5 + 1/7 .... upto 100.

public class q15 {
    public static void main(String[] args) {
        int n=1;
        double sum=0.0;
        while (n<=100) {
            sum+=(1.0/n);
            n+=2;
        }
        System.out.println(sum);
    }          
}
