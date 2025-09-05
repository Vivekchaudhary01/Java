// WAJP to print sum of all natural numbers from 1 to 100.
// 1+2+3+4+………+100

public class q1{
    public static void main(String[] args){
        int n=1,sum=0;
        while (n<=100) {
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
}