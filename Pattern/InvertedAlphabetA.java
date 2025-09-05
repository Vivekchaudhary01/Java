//          A 
//        B C
//      D E F
//    G H I J
//  K L M N O
import java.util.Scanner;

public class InvertedAlphabetA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printInvertedAlphabetA(n);
    }
    public static void printInvertedAlphabetA(int n){
        int star=1,space=n-1;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print(ch+++" ");
            star++;
            space--;
            System.out.println();
        }
    }
}
