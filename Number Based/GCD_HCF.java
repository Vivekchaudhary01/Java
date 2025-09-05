// WAJP to take two user inputs and print GCD/HCF of the three numbers.
// Euclidean algorithm of three input 
// Method to find GCD of three numbers


import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int gcd = findGCD(a, b, c);
        System.out.println("The GCD/HCF of " + a + "," + b + "and "+ c + " is: " + gcd);
    }

    public static int findGCD(int a, int b, int c) {
        return findGCD(findGCD(a, b), c);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
