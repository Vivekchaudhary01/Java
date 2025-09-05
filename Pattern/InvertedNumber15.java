//                                  15
//                          14      13
//                  12      11      10
//          9       8       7       6
//  5       4       3       2       1

import java.util.Scanner;

public class InvertedNumber15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber15(n);
    }
    public static void printInvertedNumber15(int n){
        int star=1,space=n-1,num=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(num--+"\t");
            space--;
            star++;
            System.out.println();
        }
    }
}
