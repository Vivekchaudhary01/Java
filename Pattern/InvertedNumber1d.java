//                                  1
//                          2       3
//                  6       5       4
//          7       8       9       10
//  15      14      13      12      11

import java.util.Scanner;

public class InvertedNumber1d {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber1d(n);
    }
    public static void printInvertedNumber1d(int n){
        int star=1,space=n-1,num=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++){
                if(i%2==0) System.out.print(num+++"\t");
                else System.out.print(num--+"\t");
            }

            star++;
            space--;
            if(i%2==0) num+=i;
            else num+=star;
            System.out.println();
        }
    }     
}
