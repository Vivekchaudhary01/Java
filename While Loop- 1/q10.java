// WAJP to print and count all the factors of a number.(number itself excluded)
// i/p: 28
// o/p: 1	2	4	7	14
// Total Factors are: 5

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        System.out.print("Enter the number for factors: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,count=0;
        while(i<n){
            if(n%i==0){
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        System.out.print("Total Factors are: "+count);
        sc.close();
    }
}
