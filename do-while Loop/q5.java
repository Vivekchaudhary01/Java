// Simple Password Validation System:
// Keep asking for a password until the user enters the correct one, 
// with a limit of 3 attempts.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String s1=sc.nextLine();
        int count=3;
        do{
            System.out.println("Enter the Password Again: ");
            String s2=sc.nextLine();
            if(s1.equals(s2)){
                System.out.println("Welcome Sir ...! ");
                break;
            }
            count--;
            if(count>0)
                System.out.println("Only "+count+" attempts left");
        }while(count>0);
         
    }
}
