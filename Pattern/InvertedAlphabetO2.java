//          O
//        M N
//      J K L
//    F G H I
//  A B C D E

import java.util.Scanner;

public class InvertedAlphabetO2 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printInvertedAlphabetA2(n);
    }
    public static void printInvertedAlphabetA2(int n){
        int star=1,space=n-1;
        char ch=(char)('A'+n*(n+1)/2-1);
        System.out.println(ch);
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print(ch+++" ");
            star++;
            ch=(char)(ch-(star+i));
            space--;
            System.out.println();
        }        
    }
}
