import java.util.Scanner;

public class firstWordUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String s=sc.nextLine().trim();  
        // String ch[]=s.split(" ");
        // StringBuilder result = new StringBuilder();
        // for (String word : ch) {
        //     if (word.length() > 0) {
        //         result.append(Character.toUpperCase(word.charAt(0)))
        //               .append(word.substring(1).toLowerCase())
        //               .append(" ");
        //     }
        // }

        // System.out.println("Converted String: " + result.toString().trim());

        String result="";
        boolean capitalize=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                result+=ch;
                capitalize=true;
            }
            else if(capitalize){
                result+=Character.toUpperCase(ch);
                capitalize=false;
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
