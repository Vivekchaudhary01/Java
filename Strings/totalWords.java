import java.util.Scanner;

public class totalWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine().trim();
        int total=1;
        if(s.isEmpty()){
            System.out.println(0);
        }
        else{
            for(int i=0;i<s.length();i++){
                if(Character.isWhitespace(s.charAt(i)))
                    total++;
            }
            System.out.println("Output: " + total);    
        }
    }
}
