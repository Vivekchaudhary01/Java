import java.util.Scanner;

public class lowerToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        System.out.println(s.toUpperCase());
    }
}
