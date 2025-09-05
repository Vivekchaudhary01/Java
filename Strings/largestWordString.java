import java.util.Scanner;

public class largestWordString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine().trim();
        String ch[]=s.split(" ");
        largestWord(ch);
    }
    public static void largestWord(String s[]){
        String temp="";
        for(String ch:s){
            if(ch.length()>temp.length())
                temp=ch;
        }
        System.out.println(temp);
    }
}
