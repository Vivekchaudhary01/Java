// WAJP to take a String input and count all the characters 
// without spaces in the String.


import java.util.Scanner;

public class charWithoutSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            count++;
        }
        System.out.println("Characters without spaces: "+count);
    }
}
