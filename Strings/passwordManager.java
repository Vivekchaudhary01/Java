// A password manager wants to create new passwords using two strings given by the user, then combined to create a harder-to- guess combination. Given two strings, interleave the characters of the strings to create a new string. Beginning with an empty string, alternately append a character from string a and from string b. If one of the strings is exhausted before the other, append the remaining letters from the other string all at once. The result is the new password.

// Example :
// If a = ‘hackerrank’ and b = ‘mountain’,
// The result is hmaocuknetrariannk.

import java.util.Scanner;

public class passwordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2:");
        String str2 = sc.nextLine();
        passwordManager(str1, str2);
    }

    public static void passwordManager(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len1 = str1.length(), len2 = str2.length();

        while (i < len1 && i < len2) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
            i++;
        }
        if (i < len1) {
            sb.append(str1.substring(i));
        }


        if (i < len2) {
            sb.append(str2.substring(i));
        }

        System.out.println("Generated password: " + sb.toString());
    }
}

