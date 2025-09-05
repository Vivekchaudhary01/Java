// WAJP to print sum of squares of all even numbers from 1 to 100.

public class q6 {
    public static void main(String[] args) {
        int n=2,sum=0;
        while (n<=100) {
            if (n%2==0) 
                sum+=(n*n);
            n++;
        
        }
        System.out.println(sum);
    }
}

