import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int i=0,j=s.length()-1,flag=0;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)) {
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==0)
            System.out.println("Pallindrome");
        else
            System.out.println("Not a Pallindrome.");
    }
}
