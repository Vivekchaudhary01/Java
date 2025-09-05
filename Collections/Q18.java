// Write a program to store first n prime numbers in a List and get its sum.


import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Collection<Integer> c1=new ArrayList<>();
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                c1.add(i);
        }
        int sum=0;
        Iterator<Integer> itr=c1.iterator();
        while (itr.hasNext()) {
            sum+=itr.next();
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }    
}
