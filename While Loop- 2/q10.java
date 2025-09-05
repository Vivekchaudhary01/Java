// WAJP to print the sum of below series:

// 1*2+2*3+3*4.... upto 100

public class q10 {
    public static void main(String[] args) {
        int n=1,sum=0;
        while (n<100) {
            sum+=(n*n+1);
            n++;
        }
        System.out.println(sum);
    }    
}
