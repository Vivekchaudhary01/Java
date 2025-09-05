import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s:");
        String s=sc.nextLine();
        System.out.println("Enter the String 2:");
        String t=sc.nextLine();
        if(isAnagram(s,t))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
    public static boolean isAnagram(String s, String t){
        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen)
            return false;
        int sFreq[]=new int[26];
        int tFreq[]=new int[26];
        for(char ch:s.toCharArray())
            sFreq[ch-'a']++;
        for(char ch:t.toCharArray())
            tFreq[ch-'a']++;
        for(int i=0;i<26;i++){
            if(sFreq[i]!=tFreq[i])
                return false;
        }
        return true;
    }
}
