import java.util.Scanner;

public class fourDigitIntoWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        String s=sc.nextLine();
        String words[]={
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            result.append(words[s.charAt(i)-'0']).append(" ");
        }
        System.out.println("In words:"+result.toString());
    }
}
