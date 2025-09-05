
import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits in " + n + " is: " + digitSum(n));
    }

    public static int digitSum(int n) {
        if (n == 0)
            return 0;
        else
            return n % 10 + digitSum(n / 10);
    }
}
