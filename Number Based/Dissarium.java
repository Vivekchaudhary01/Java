// WAJP to take user input and print whether the number is dissarium number or not.
// A number is said to be a dissarium number if the sum of its digits raised to the power of their respective positions is equal to the number itself.
// For example, 89 is a dissarium number because 8^1 + 9^2 = 8 + 81 = 89.

import java.util.Scanner;

public class Dissarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tehe Number: ");
        int n=sc.nextInt();
        if (isDissarium(n)) {
            System.out.println(n+ " is a Dissarium Number.");
        }
        else
            System.out.println(n+ " is not a Dissarium Number.");
    }

    public static boolean isDissarium(int n){
        int temp=n,sum=0,i=0;
        int length=String.valueOf(n).length();
        while (temp!=0) {
            sum+=Math.pow(temp%10, length-i);
            temp/=10;
            i++;
        }
        return sum==n;
    }
}
