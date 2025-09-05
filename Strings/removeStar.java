// Removing Stars From a String
// You are given a string s, which contains stars *.
// In one operation, you can:
// Choose a star in s.
// Remove the closest non-star character to its left, as well as remove the star itself.
// Return the string after all stars have been removed.
// Note:
// The input will be generated such that the operation is always possible.
// It can be shown that the resulting string will always be unique.
// Example 1:
// Input: s = "leet**cod*e"
// Output: "lecoe"
// There are no more stars, so we return "lecoe".
// Example 2:
// Input: s = "erase*****"
// Output: ""
// Explanation: The entire string is removed, so we return an empty string.

import java.util.Scanner;
import java.util.Stack;

public class removeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        s = removeStars(s);
        System.out.println(s);
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}

