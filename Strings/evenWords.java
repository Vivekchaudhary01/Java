import java.util.Scanner;

public class evenWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String s=sc.nextLine().trim();
        String ch[]=s.split(" ");
        int count=0;
        for(String s1:ch){
            if(isEven(s1)){
                System.out.println(s1);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isEven(String s){
        if(s.length()%2==0)
            return true;
        return false;
    }    
}
