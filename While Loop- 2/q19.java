// WAJP to accept a input from user and print factorial of that number.
// i/p: 6
// o/p: 6!= 720

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for Factorial : ");
        int n=sc.nextInt();
        int i=1,f=1;
        while(i<=n){
            f*=i;
            i++;
        }
        System.out.println("Factorial is: "+ f);      
        sc.close();  
    }    
}
