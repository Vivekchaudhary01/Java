//        * 
//      * * *
//    * * * * *
//  * * * * * * *
//        *
//        *
//        *

import java.util.Scanner;

public class upArrowQ47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printUpArrow(n);
    }    
    public static void printUpArrow(int n){
        int space=n/2,mid=n/2+1,star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)          
                System.out.print("  ");
            for(int k=1;k<=star;k++)
                System.out.print("* ");
            if(i<mid){
                star+=2;
                space--;
            }
            else{
                space=n/2;
                star=1;
            }
            System.out.println();
        }
    }
}
