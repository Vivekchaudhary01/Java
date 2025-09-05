import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Enter the number of digits: ");
        int r= sc.nextInt();
        System.out.println("The number of permutations is: " + Combinations(n, r));
    }
    public static int Combinations(int n, int r) {
        return factorial(n) / (factorial(n - r)*factorial(r));
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
