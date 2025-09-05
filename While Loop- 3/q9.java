// Write a java program to take a user input and count how many 3 has appeared in the number
// Input:
// N=4373533;
// Output:
// 4

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            if(n%10==3)
                count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
