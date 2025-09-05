//        * @ @ @ @           @ @ @ @ * 
//      * *       @           @       * *
//    * * *       @           @       * * *
//  * * * *       @           @       * * * *
//    * * *         * * * * *         * * *
//      * *           * * *           * *
//        *             *             *


import java.util.Scanner;

public class BigPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printBigPattern(n);
    }
    public static void printBigPattern(int n){
        int sSpace=n/2,mid=n/2+1,mSStar=n+2, mEStar=2*n-1, eStar=(5*n+2)/2;
        
        for(int i=1;i<=n;i++){

            for(int j=1;j<=mid;j++){              // part 1
                if(j<=sSpace)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }

            for(int j=mid+1;j<=n+1;j++){               // part 2
                if(i==1||j==n+1&&i<=mid)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }

            for(int j=n+2;j<=2*n-1;j++){                  // part 3
                if(i>mid&&j>=mSStar&&j<=mEStar)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            for(int j=2*n;j<=5*n/2;j++){                  // part 4
                if(i==1||j==2*n&&i<=mid)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }

            for(int j=5*n/2+1;j<=3*n;j++)
                if(j<=eStar)
                    System.out.print("* ");

            if(i<mid){
                eStar++;
                sSpace--;
            }
            else{
                sSpace++;
                eStar--;
            }
            if(i>mid){
                mSStar++;
                mEStar--;
            }
            System.out.println();

        }
    }
}
