import java.util.Scanner;

public class exchangeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine().trim();    
        System.out.println("Enter the 1st INPUT: ");
        String from=sc.nextLine().trim();
        System.out.println("Enter the 2nd INPUT: ");
        String to=sc.nextLine().trim();
        int fromIdx=str.indexOf(from);
        int toIdx=str.indexOf(to);
        if(fromIdx==-1||toIdx==-1)
            System.out.println("one or both substrings not found.");
        else{
            StringBuilder sb=new StringBuilder(str);
            String tempFrom=str.substring(fromIdx, fromIdx+from.length());
            String tempTo=str.substring(toIdx, toIdx+to.length());

            sb.replace(fromIdx, fromIdx+from.length(), tempTo);
            sb.replace(toIdx, toIdx+to.length(), tempFrom);

            System.out.println("After Swapping: ");
            System.out.println(sb.toString());
        }
        
    }    
}
