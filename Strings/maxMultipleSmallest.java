import java.util.Scanner;

public class maxMultipleSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine().trim();

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (freq[current] > freq[ch]) {
                ch = current;
            } else if (freq[current] == freq[ch] && current < ch) {
                ch = current;
            }
        }
        System.out.println("Max is: " + ch);
        sc.close();
    }
}

