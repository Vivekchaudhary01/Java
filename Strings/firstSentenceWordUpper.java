import java.util.Scanner;

public class firstSentenceWordUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine().trim();
        StringBuilder result = new StringBuilder();

        boolean capitalize = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (capitalize && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalize = false;
            } else {
                result.append(Character.toLowerCase(ch));
            }
            if (ch == '.' || ch == '!' || ch == '?') {
                capitalize = true;
            }
        }

        System.out.println("Formatted string:");
        System.out.println(result);
    }
}
