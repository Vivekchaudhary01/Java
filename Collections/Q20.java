// Write a program to store first n Fibonacci numbers in a List.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        List<Integer> c1= generateFibonacci(n);
        
        for(int val:c1){
            System.out.println(val+" ");
        }
    }
    public static List<Integer> generateFibonacci(int n){
        List<Integer> l1=new ArrayList<>();
        if(n>=1)    l1.add(0);
        if(n>=2)    l1.add(1);

        while (l1.size()<n) {
            int size=l1.size();
            int next=l1.get(size-1)+l1.get(size-2);
            l1.add(next);
        }
        return l1;
    }     
}
