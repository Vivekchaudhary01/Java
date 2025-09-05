import java.util.Scanner;

public class indexNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine().trim();

        int idx=FirstNonRepeating(s);
        System.out.println(idx);
    }       
    public static int FirstNonRepeating(String s){
        int freq[]=new int[256];
        char[] ch=s.toCharArray();
        for(char c:ch)
            freq[c-'a']++;
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a']==1)
                return i;
        }
        return -1;
    }
}
