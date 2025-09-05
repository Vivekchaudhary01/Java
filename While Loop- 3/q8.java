// Write a java program to take a user input and count how many 0 digit is in number.
// Input:
// N=430705;
// Output:
// 2

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            if(n%10==0)
                count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
