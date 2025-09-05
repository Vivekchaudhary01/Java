//                 *
//            1    *    2
//       3    4    *    5    6
//   *   *    *    *    *    *    *
//       7    8    *    9    10
//            11   *    12
//                 *

import java.util.Scanner;

public class DiamondMixed2Q40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n=sc.nextInt();
        printDiamondMixed2Q40(n);
    }
    public static void printDiamondMixed2Q40(int n){
        int star=1,mid=n/2,space=mid,num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++){
                if(i==mid||(k+space)==mid)
                    System.out.print("*\t");
                else 
                    System.out.print(num+++"\t");
            }
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
