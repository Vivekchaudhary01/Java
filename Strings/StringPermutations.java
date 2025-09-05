import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Permutations:");
        permute(str, 0, str.length() - 1);
    }
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);       
                permute(str, l + 1, r);    
                str = swap(str, l, i);        
            }
        }
    }
    public static String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
