//          O 
//        N M
//      L K J
//    I H G F
//  E D C B A

import java.util.Scanner;

public class InvertedAlphabetO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedAlphabetO(n);
    }
        public static void printInvertedAlphabetO(int n){
        int star=1,space=n-1;
        char ch=(char)('A'+(n*(n+1))/2-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print(ch--+" ");
            star++;
            space--;
            System.out.println();
        }
    }
    
}
