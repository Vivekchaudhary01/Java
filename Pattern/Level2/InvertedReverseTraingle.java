//  * * * * 
//    * * * 
//      * * 
//        * 

import java.util.Scanner;

public class InvertedReverseTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();
        int star=n,space=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            
            space++;
            star--;
            System.out.println();
        }
    }    
}
