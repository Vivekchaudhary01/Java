import java.util.Scanner;

public class PanagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s:");
        String s=sc.nextLine();
        if(isPanagram(s))
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
    public static boolean isPanagram(String s){
        int sLen=s.length();

        int sFreq[]=new int[26];
        for(char ch:s.toCharArray())
            sFreq[ch-'a']++;

        for(int i=0;i<26;i++){
            if(sFreq[i]<1)
                return false;
        }
        /*
         * for(char ch='a';ch<='z';ch++)
         *      if(s.indexOf(ch)<1)
         *          return false;
         */
        return true;
    }
}

