//         * 
//       *   *
//     *   *   *
//   *   *   *   *
//     *   *   *
//       *   *
//         *

import java.util.Scanner;

public class DiamondSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printDiamondSpace(n);
    }
    public static void printDiamondSpace(int n){
        int star=1,space=n-1,mid=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<2*star-1;k++){
                if(k%2==0)  System.out.print("* ");
                else System.out.print("  ");
            }
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
