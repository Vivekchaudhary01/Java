import java.util.Scanner;

public class removePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int idx=s.lastIndexOf("\\");
        s=s.substring(idx+1);
        System.out.println(s);
    }        
}
