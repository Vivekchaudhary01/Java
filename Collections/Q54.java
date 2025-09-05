// Valid Parentheses or NOT

import java.util.Scanner;
import java.util.Stack;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("The string has VALID parentheses.");
        } else {
            System.out.println("The string has INVALID parentheses.");
        }
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    } 
}
