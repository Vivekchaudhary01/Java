//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printPyramid(n);
    }    
    public static void printPyramid(int n){
        int space=n-1,star=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            
            star+=2;space--;    
            System.out.println();
       }
    }
}
