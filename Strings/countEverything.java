// WAJP to take a String input and count all the space 
//characters, uppercase, lowercase, numeric, special 
//characters in the String.


import java.util.Scanner;

public class countEverything {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int countSpace=0,countUp=0,countLc=0,countNum=0,countSc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                countSpace++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                countUp++;
            }
            else if(Character.isLowerCase(s.charAt(i))){
                countLc++;
            }
            else if(Character.isDigit(s.charAt(i))){
                countNum++;
            }
            else 
                countSc++;
        }
        System.out.println("spaces: "+countSpace+" Up: "+countUp+" Lc: "+countLc+" Digit: "+countNum+" Special: "+countSc);
    }      
}
