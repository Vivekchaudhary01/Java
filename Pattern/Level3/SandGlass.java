//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
//      * * * 
//    * * * * *
//  * * * * * * *

import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows");
        int n=sc.nextInt();
        printSandGlass(n);
    }
    public static void printSandGlass(int n){
        int star=n,space=0,mid=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print("* ");
            if(i<mid){
                star-=2;space++;
            }
            else{
                star+=2;space--;
            }
            System.out.println();
        }
    }
}
