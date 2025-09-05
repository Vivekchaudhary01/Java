import java.util.Scanner;

public class maxTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().trim();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)]++;
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]>ch){
                ch=s.charAt(i);
            }
        }
        System.out.println("max is: "+ch);
    }    
}
