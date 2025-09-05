import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        
        int[] freq = new int[256]; 
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > 0) {
                freq[s.charAt(i)]=0;
                result.append(s.charAt(i));
            }
        }

        System.out.println("Output: " + result.toString());
    }
}

