//      * 
//    * * 
//  * * * 
//    * * 
//      * 

import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        if(n%2==0)  System.out.println("enter odd number");
        else
            printLeftPyramid(n);
    }
    public static void printLeftPyramid(int n){
        int star=1,mid=n/2,space=n/2;
        for(int i=0;i<n;i++){
            for(int k=0;k<space;k++)
                System.out.print("  ");
            for(int j=0;j<star;j++)
                System.out.print("* ");
            if(i<mid){
                star++;space--;
            }
                
            else{
                star--;space++;
            }
            System.out.println();
        }

    }    
}
