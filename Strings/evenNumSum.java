import java.util.Scanner;

public class evenNumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String: ");
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))&&((s.charAt(i)-'0')%2==0)){
                sum=sum+(s.charAt(i)-'0');
            }
        }
        System.out.println("Sum is:"+sum);
    }
}
