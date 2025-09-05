//        * @ @ @ @ @ * 
//      * *           * *
//    * * *           * * *
//  * * * *           * * * *
//    * * *           * * *
//      * *           * *
//        *           *

import java.util.Scanner;

public class MixedEarLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        n=7;
        printMixedEarLine(n);
    }    
    public static void printMixedEarLine(int n){
        int sSpace=n/2,mid=n/2+1,eStar=n+3;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=mid;j++)
                if(j<=sSpace)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            
            for(int j=mid+1;j<=n+2;j++){
                if(i==1)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }

            for(int j=n+3;j<=2*n-1;j++){
                if(j<=eStar)
                    System.out.print("* ");
            }
        if(i<mid){
            sSpace--;
            eStar++;
        }
        else{
            sSpace++;
            eStar--;
        }
        System.out.println();
        }
    }
}
