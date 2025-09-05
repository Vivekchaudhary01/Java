import java.util.Scanner;

public class biggestNumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine().trim();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))&&(s.charAt(i)-'0')>num){
                num=(s.charAt(i)-'0');
            }
        }
        if(num==0)
            System.out.println(-1);
        else 
            System.out.println(num);
    }
}
