import java.util.Scanner;

public class validPallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        if(validPallindrome(s))
            System.out.println("valid Pallindrome");
        else
            System.out.println("Not a Pallindrome.");
    }
    public static boolean validPallindrome(String s){
        int left=0,right=s.length()-1;

        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                return false;
            } 
            left++;
            right--;
        }

        return true;        
    }
}
