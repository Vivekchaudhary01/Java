// WAJP to take user input and print whether the number is Strong number or not.
// Strong number is a number whose sum of factorial of digits is equal to the number itself.
// For example: 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145

import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        int num, sum = 0, temp, digit;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }   
    
}
