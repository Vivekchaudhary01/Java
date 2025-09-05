// WAJP to take three user inputs and print LCM of the three numbers.
import java.util.Scanner;
public class LCMofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find their LCM:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int lcm = findLCM(num1, num2, num3);
        System.out.println("The LCM of " + num1 + ", " + num2 + ", and " + num3 + " is: " + lcm);
    }
    public static int findLCM(int a, int b, int c) {
        return findLCM(findLCM(a, b), c);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}
