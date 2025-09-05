//        *             *             * 
//        *             *             *
//        *             *             *
//  * * * * * * * * * * * * * * * * * * * * *
//    * * * * *     * * * * *     * * * * *
//      * * *         * * *         * * *
//        *             *             *

import java.util.Scanner;

public class ThreeDownArrow2Q51 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printThreeDownArrow2Q51(n);
    }    
    public static void printThreeDownArrow2Q51(int n){
        int star=1,space=n/2,mid=n/2,count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            for(int j=1;j<=2*space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            for(int j=1;j<=2*space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            
            if(i>=mid){
                if(count==0){
                    star*=7;
                    space=0;
                    count++;
                }
                else{
                    star-=2;
                    space++;
                }
            }
            System.out.println();
        }
    }    
}
