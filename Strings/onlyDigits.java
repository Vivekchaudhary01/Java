import java.util.Scanner;

public class onlyDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("Contains only Digit");
        else
            System.out.println("Contains other things.");
    }       
}
