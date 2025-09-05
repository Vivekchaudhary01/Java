//        *             *             * 
//      * * *         * * *         * * * 
//    * * * * *     * * * * *     * * * * * 
//  * * * * * * * * * * * * * * * * * * * * * 

import java.util.Scanner;

public class ThreePyramidQ48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int n=sc.nextInt();
        printThreePyramidQ48(n);
    }
    public static void printThreePyramidQ48(int n){
        int space=n-1,star=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++)
                System.out.print("  ");
            for(int k=1;k<=star;k++)
                System.out.print("* ");
            for(int k=1;k<=2*space;k++)
                System.out.print("  ");
            for(int k=1;k<=star;k++)
                System.out.print("* ");
            for(int k=1;k<=2*space;k++)
                System.out.print("  ");
            for(int k=1;k<=star;k++)
                System.out.print("* ");     
            
            star+=2;
            space--;
            System.out.println();
        }
    }
}
