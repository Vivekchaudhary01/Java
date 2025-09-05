// 5   4   3   2   1   2   3   4   5
//     4   3   2   1   2   3   4
//         3   2   1   2   3
//             2   1   2
//                 1

import java.util.Scanner;

public class ReverseNoPyramidMid1andMirror {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printReverseNoPyramidMID1andMirror(n);
   } 
   public static void printReverseNoPyramidMID1andMirror(int n){
    int star=2*n-1,space=0,num=n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print(num+++"\t");
            else{
                if(space+k<n){
                    System.out.print(num--+"\t");
                }
                else{
                    System.out.print(num+++"\t");
                }
            }
        }
        num-=2;
        star-=2;
        space++;
        System.out.println();
    }
   }         
}
