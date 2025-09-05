// WAJP to take three user inputs and print HCF of the three numbers.
import java.util.Scanner;
public class HCFofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find their HCF:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int hcf = findHCF(num1, num2, num3);
        System.out.println("The HCF of " + num1 + ", " + num2 + ", and " + num3 + " is: " + hcf);
    }
    public static int findHCF(int a, int b, int c) {
        return findHCF(findHCF(a, b), c);
    }   
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}
