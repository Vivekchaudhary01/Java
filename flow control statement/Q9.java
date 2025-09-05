//WAJP to take year input from user and print it is a Leap year or NOT.

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if((year%100!=0&&year%4==0) || year%400==0)
            System.out.println("Leap year");
        
        else
            System.out.println("Not a leap year");
        
        sc.close();
    }
}
