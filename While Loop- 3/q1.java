// Write a java program to take a user input and print each digits of the number one by one. 
// Input: 
// N=43705; 
// Output: 
// 5 
// 0 
// 7 
// 3 
// 4 

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
        sc.close();
    }    
}
