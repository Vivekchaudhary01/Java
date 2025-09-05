import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();

        System.out.println("Reversed from start: " + reverseFromStart(input));
        System.out.println("Reversed from end: " + reverseFromEnd(input));
    }

    public static String reverseFromStart(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }

    public static String reverseFromEnd(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
