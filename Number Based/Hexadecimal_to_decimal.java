import java.util.Scanner;

public class Hexadecimal_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        System.out.println(Hexadecimal_to_decimal(hex));
    }
    public static int Hexadecimal_to_decimal(String hex) {
        int decimal = 0;
        int base = 1; // 16^0
        int length = hex.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int value;
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            decimal += value * base;
            base *= 16; // Increase the base by a factor of 16
        }
        return decimal;
    }
}
