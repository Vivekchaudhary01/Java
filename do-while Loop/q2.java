// WAJP to print power of a and b and ask user in end to press Y/y to continue or any other key to exit.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter the value of a and b for power calculation: ");
            int a=sc.nextInt(),power=1;
            int b=sc.nextInt();
            while (b>0) {
                power=a*power;
                b--;
            }
            System.out.println(power+" is the Answer");

            System.out.println("Do yo want to Continue: ");
            ch=sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');
    }
}
