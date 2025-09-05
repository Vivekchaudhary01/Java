// WAJP to print the sum of below series:
// 1/2 + 1/4 + 1/6 + 1/8 .... upto 100.


public class q14 {
    public static void main(String[] args) {
        int n=2;
        double sum=0.0;
        while (n<=100) {
            sum+=(1.0/n);
            n+=2;
        }
        System.out.println(sum);
    }      
}
