import java.util.Scanner;

public class replaceSpaceWithUnderscore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        // Using replace()
        s=s.replace(' ', '_');
        System.out.println(s);

        // Without Using replace()
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                str=str+"_";
            }
            else{
                str=str+s.charAt(i);
            }
        }
        System.out.println("String is: "+str);
    }      
}
