// WAJP to count the factors of a number.(number itself excluded)
// i/p: 28
// o/p: Total Factors are: 5

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        System.out.print("Enter the number for factors: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,count=0;
        System.out.println("Total Factors are: ");
        while(i<n){
            if(n%i==0)
                count++;
            i++;
        }
        System.out.println(count);
        sc.close();
    }
}

