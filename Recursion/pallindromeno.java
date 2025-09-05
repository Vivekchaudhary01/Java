import java.util.Scanner;

public class pallindromeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n==reverseNo(n,0)){
            System.out.println(n+" is a palindrome number.");
        } else {
            System.out.println(n+" is not a palindrome number.");
        }
    }
    public static int reverseNo(int n,int rev){
        if(n==0)
            return rev;
        return reverseNo(n/10, rev*10+n%10);
    }
}
