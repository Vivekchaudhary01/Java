// WAJP to accept two numbers from user and print power of a to b.
// i/p: 6	3
// o/p: 6 to power 3 is: 216

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers for power a snd b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1,power=1;
        while(i<=b){
            power*=a;
            i++;
        }
        System.out.println("Power "+ a +" ^ " + b +" is : "+ power);      
        sc.close();
    }    
}
