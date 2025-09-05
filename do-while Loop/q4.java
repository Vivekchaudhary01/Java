// Keep Asking for Input Until Sum Exceeds 100. 
// Continuously take numbers as input from the user until their sum exceeds 
// 100 using a do-while loop and then print how many numbers were entered to 
// get sum 100.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int sum=0,n,count=0;
        do{
            n=sc.nextInt();
            if(n>0)
                sum+=n;
            count++;
        }while(sum<100); 
        System.out.println("Count is: "+ count);
    }
}
