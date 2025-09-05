// Design a method which will accept a number and will return true if all the digits of the number is in increasing order.
// Input:
// N=2568;
// Output:
// true

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println(isNumberIncreasingOrder(n));
        sc.close();
    }
    static boolean isNumberIncreasingOrder(int n){
        int prev=n%10;
        n/=10;
        while (n>0) {
            if(prev<n%10)
                return false;
            prev=n%10;
            n/=10;
        }
        return true;
    }
}
