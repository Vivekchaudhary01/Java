import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        int sum = 0;
        int num = 0;
        boolean isNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    sum += num;
                    num = 0;
                    isNumber = false;
                }
            }
        }

        if (isNumber) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}
