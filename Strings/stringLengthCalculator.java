// WAJP to take a String input get length of String without using length() method in at least four different ways.

import java.util.Scanner;

public class stringLengthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Method 1: Using toCharArray()
        int length1 = 0;
        for (char c : s.toCharArray()) {
            length1++;
        }
        System.out.println("Length (Method 1 - toCharArray): " + length1);

        // Method 2: Using try-catch with charAt()
        int length2 = 0;
        try {
            while (true) {
                s.charAt(length2);
                length2++;
            }
        } catch (Exception e) {
            // Do nothing
        }
        System.out.println("Length (Method 2 - charAt with exception): " + length2);

        // Method 3: Using substring and exception
        int length3 = 0;
        try {
            while (true) {
                s.substring(length3, length3 + 1);
                length3++;
            }
        } catch (Exception e) {
            // Do nothing
        }
        System.out.println("Length (Method 3 - substring with exception): " + length3);

        // Method 4: Using split() and counting characters
        String[] arr = s.split(""); // splits into characters
        int length4 = 0;
        for (String ch : arr) {
            length4++;
        }
        System.out.println("Length (Method 4 - split to array): " + length4);
    }
}

