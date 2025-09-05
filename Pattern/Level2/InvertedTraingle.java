//        * 
//      * *
//    * * *
//  * * * *

import java.util.Scanner;

public class InvertedTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        int star=1,space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int k=1;k<=star;k++)
                System.out.print("* ");
            star++;space--;
            System.out.println();
        }
    }
}
