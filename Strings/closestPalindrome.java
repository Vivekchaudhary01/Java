import java.util.Scanner;

public class closestPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println(closestPalindrome(s));
    }    
    public static String closestPalindrome(String s){
        if(s.length()==1||Integer.parseInt(s)%10==0)
            return String.valueOf(Integer.parseInt(s)-1);
        int mid=s.length()/2;
        char ch[]=s.toCharArray();
        int i=mid-1,j=mid+1;
        while(i>=0){
            ch[j]=ch[i];
            i--;
            j++;
        }
        return String.valueOf(ch);
    }
}
