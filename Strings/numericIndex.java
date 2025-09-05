import java.util.Scanner;

public class numericIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.print(i+" ");
            }
        }
    }       
}
