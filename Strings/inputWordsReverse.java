import java.util.Scanner;

public class inputWordsReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        String[] ch=s.split(" ");
        s="";
        for(int i=ch.length-1;i>=0;i--){
            s=s+ch[i];
            if(i!=0){
                s=s+" ";
            }
        }
        System.out.println(s.length());
    }
}
