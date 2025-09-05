import java.util.Scanner;

public class missingDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String  s=sc.nextLine().trim();
        int max=0;
        for(char c:s.toCharArray()){
            if(max<(c-'0')) max=c-'0';
        }
        int total=(max*(max+1))/2;
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        System.out.println(total-sum);
    }
}
