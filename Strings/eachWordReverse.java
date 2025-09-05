import java.util.Scanner;

public class eachWordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        String[] ch=s.split(" ");
        s="";
        for(int i=0;i<ch.length;i++){
            s=s+stringReverse(ch[i]);
            if(i!=(ch.length-1)){
                s=s+" ";
            }
        }
        System.out.println(s);
    }
    public static String stringReverse(String s){
        char[] ch = s.toCharArray(); 
        int i = 0, j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }    
}
