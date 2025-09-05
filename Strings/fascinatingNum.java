import java.util.Scanner;

public class fascinatingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s:");
        int n=sc.nextInt();
        if(isFascinating(n))
            System.out.println("Fascinating");
        else
            System.out.println("Not Fascinating");
    }
    public static boolean isFascinating(int n){
        if(n<100||n>999) return false;
        String concat=""+n+(2*n)+(3*n);
        if (concat.length()!=9) 
            return false;
        int[] freq = new int[10];
        for (char ch : concat.toCharArray()) {
            int digit = ch - '0';
            if (digit == 0) return false; 
            freq[digit]++;
        }
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) return false;
        }

        return true;

    }    
}
