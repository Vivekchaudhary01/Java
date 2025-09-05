// WAJP to keep taking input from the user until they enter a negative number. 
// When –ve number or zero is entered then print sum of all the +ve number entered.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int sum=0,n;
        do{
            n=sc.nextInt();
            if(n>0)
                sum+=n;
        }while(n>0); 
        System.out.println("Sum is: "+ sum);
    }
}