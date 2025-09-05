//      * 
//    * * *
//  * * * * *
//    * * *
//      *

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows");
        int n=sc.nextInt();
        printDiamond(n);
    }
    public static void printDiamond(int n){
        int star=1,space=n/2,mid=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<star;k++)
                System.out.print("* ");
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
