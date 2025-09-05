//        @ 
//      * @ *
//    * * @ * *
//  @ @ @ @ @ @ @
//    * * @ * *
//      * @ *
//        @

import java.util.Scanner;

public class DiamondMixedQ39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n=sc.nextInt();
        printDiamondMixedQ39(n);
    }
    public static void printDiamondMixedQ39(int n){
        int star=1,mid=n/2,space=mid;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++){
                if(i==mid||(k+space)==mid)
                    System.out.print("@ ");
                else 
                    System.out.print("* ");
            }
            if(i<mid){
                star+=2;space--;
            }
            else{
                star-=2;space++;
            }
            System.out.println();
        }
    }
}
