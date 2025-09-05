//                                  1
//                          2       3
//                  4       5       6
//          7       8       9       10
//  11      12      13      14      15

import java.util.Scanner;

public class InvertedNumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber1(n);
    }
    public static void printInvertedNumber1(int n){
        int star=1,space=n-1,num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(num+++"\t");
            star++;
            space--;
            System.out.println();
        }
    }
}
