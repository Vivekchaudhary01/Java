//WAJP to check and print the given number is divisible by both 5 and 11 or not.

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.print((n%5==0 && n%11==0)?"The number is divisible by 5 and 11":"The number is not divisible by 5 and 11");
        sc.close();
    }
}
