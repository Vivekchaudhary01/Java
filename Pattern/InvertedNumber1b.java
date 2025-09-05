//                                      1
//                              3       2
//                      6       5       4
//              10      9       8       7
//      15      14      13      12      11

import java.util.Scanner;

public class InvertedNumber1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber1b(n);
    }
    public static void printInvertedNumber1b(int n){
        int star=1,space=n-1,num=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(num--+"\t");

            star++;
            space--;
            num=num+(2*star-1);
            System.out.println();
        }
    }
}
