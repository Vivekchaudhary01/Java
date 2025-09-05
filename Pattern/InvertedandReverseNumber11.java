//  11      12      13      14      15
//          7       8       9       10
//                  4       5       6
//                          2       3
//                                  1

import java.util.Scanner;

public class InvertedandReverseNumber11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber11(n);
    }
    public static void printInvertedNumber11(int n){
        int star=n,space=0,number=n*(n+1)/2;
        number-=(n-1);
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(number+++"\t");
            star--;
            space++;
            number-=(2*star+1);
            System.out.println();
        }

    }
}
