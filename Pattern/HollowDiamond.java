//        *
//      *   *
//    *       *       
//      *   *
//        *

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        if(n%2==0)  System.out.println("Enter odd number.");
        else
        printHollowDiamond(n);
    }
    public static void printHollowDiamond(int n){
        int mid=n/2,a=mid+1,b=a;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j==a||j==b)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }   
            if(i<mid){
                a--;
                b++;
            }
            else{
                a++;
                b--;
            }
            System.out.println();
        }
    }
}
