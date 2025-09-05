//  5       4       3       2       1
//          9       8       7       6
//                  12      11      10
//                          14      13
//                                  15

import java.util.Scanner;

public class InvertedandReverseNumber5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber5(n);
    }
    public static void printInvertedNumber5(int n){
        int star=n,space=0,num=n;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(num--+"\t");
            space++;
            star--;
            num+=2*star+1;
            System.out.println();
        }
    }    
}
