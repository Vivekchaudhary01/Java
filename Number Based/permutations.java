import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Enter the number of digits: ");
        int r= sc.nextInt();
        System.out.println("The number of permutations is: " + permutations(n, r));
    }
    public static int permutations(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
