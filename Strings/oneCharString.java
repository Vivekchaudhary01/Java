import java.util.Scanner;

public class oneCharString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
