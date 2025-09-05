// WAJP to print sum of all even numbers from 1 to 100.

public class q2 {
    public static void main(String[] args) {
        int n=2,sum=0;
        while (n<=100) {
            if(n%2==0)
                sum+=n;
            n++;
        }
        System.out.println(sum);
    }    
}
