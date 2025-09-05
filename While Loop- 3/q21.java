// Design a method which will accept a number and will return true if it has different alternating digits.
// Input:
// N=726352;
// Output:
// true

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println(isNumberAlternatingOrder(n));
        sc.close();
    }
    static boolean isNumberAlternatingOrder(int n){
        int prev=n%10;
        n/=10;
        while (n>0) {
            if(prev==n%10)
                return false;
            prev=n%10;
            n/=10;
        }
        return true;
    }
}
