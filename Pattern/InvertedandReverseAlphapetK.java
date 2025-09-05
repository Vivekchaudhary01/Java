//  K L M N O 
//    G H I J
//      D E F
//        B C
//          A

import java.util.Scanner;

public class InvertedandReverseAlphapetK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedAlphabetK(n);
    }
    public static void printInvertedAlphabetK(int n){
        int star=n,space=0;
        char ch=(char)('A'+(n*(n+1)/2)),ch1;
        ch-=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            ch1=ch;
            for(int k=1;k<=star;k++)
                System.out.print(ch+++" ");
            star--;
            ch=(char)(ch1-star);
            space++;
            System.out.println();
        }
    }
}
