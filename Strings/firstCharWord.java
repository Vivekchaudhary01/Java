import java.util.Scanner;

public class firstCharWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        firstCharWord(s);
    }   
    public static void firstCharWord(String s){
        String str="";
        String words[]=s.split("\\s+");
        for(String s1:words){
            str+=s1.charAt(0);
        }
        System.out.println(str);
    }
}
