//          A 
//        C B
//      F E D
//    J I H G
//  O N M L K

import java.util.Scanner;

public class InvertedAlphabetA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printInvertedAlphabetA2(n);
    }
    public static void printInvertedAlphabetA2(int n){
        int star=1,space=n-1;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print(ch--+" ");
            star++;
            ch+=star+i;
            space--;
            System.out.println();
        }        
    }
}
