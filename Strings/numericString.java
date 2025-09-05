import java.util.Scanner;

public class numericString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        System.out.println("All the Numeric Characters are: "+count);
    }
}
