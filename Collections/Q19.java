// Write a program to store first n prime numbers in a List and then access any prime number in that range.

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> c1=new ArrayList<>();
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int i=2;
        while (c1.size()<n) {
            if(isPrime(i))
                c1.add(i);
            i++;
        }
        
        System.out.println("Enter Prime no. to access: ");
        int idx=sc.nextInt();
        System.out.println(c1.get(idx-1));
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0)
                return false;
        }
        return true;
    }      
}
