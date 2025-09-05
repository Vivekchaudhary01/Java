// Counting Bits
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

// Example 1:           Example 2:
// Input: n = 2         Input: n = 5
// Output: [0,1,1]      Output: [0,1,1,2,1,2]
// Explanation:         Explanation:
// 0 --> 0              0 --> 0
// 1 --> 1              1 --> 1
// 2 --> 10             2 --> 10
//                      3 --> 11
//                      4 --> 100
//                      5 --> 101 

import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int bits[]=CountingBits(n);    
        for(int i:bits)
            System.out.print(i+" ,");
    }  
    public static int[] CountingBits(int n){
        int bits[]=new int[n+1];
        bits[0]=0;
        for(int i=1;i<=n;i++){
            bits[i]=checkBits(i);
            // bits[i]=biys[i>>1]+(i%2);
        }
        return bits;
    }     
    public static int checkBits(int n){
        int sum=0;
        while(n>0){
            int bit=n%2;
            if(bit==1)
                sum++;
            n=n/2;
        }
        return sum;
    }
}
