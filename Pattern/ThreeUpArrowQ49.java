//        *             *             * 
//      * * *         * * *         * * * 
//    * * * * *     * * * * *     * * * * * 
//  * * * * * * * * * * * * * * * * * * * * * 
//        *             *             * 
//        *             *             *
//        *             *             *

import java.util.Scanner;

public class ThreeUpArrowQ49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int n=sc.nextInt();
        printThreeUpArrowQ49(n);
    }
    public static void printThreeUpArrowQ49(int n){
        int space=n/2,star=1,mid=n/2+1;
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
            
            if(i<mid){
                star+=2;
                space--;
            }
            else{
                star=1;
                space=n/2;
            }
            System.out.println();
        }
    }    
}
