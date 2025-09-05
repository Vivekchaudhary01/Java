// WAJP to accept a number from user and print sum of all its factors(number itself excluded).
// i/p: 14
// o/p: sum is: 10  (1+2+7)

import java.util.Scanner;;

public class q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int i=1,sum=0;
        while (i<=n/2) {
            if(n%i==0)
                sum+=i;
            i++;
        }
        System.out.println("Sum of all Factors are : "+ sum);
        sc.close();
    }
}
