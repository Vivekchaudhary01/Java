// 1   2    3    4    5    4    3    2    1
//     1    2    3    4    3    2    1
//          1    2    3    2    1
//               1    2    1
//                    1

import java.util.Scanner;

public class ReverseNoPyramidMidNoandMirror {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printReverseNoPyramidMIDNoandMirror(n);
   } 
   public static void printReverseNoPyramidMIDNoandMirror(int n){
    int star=2*n-1,space=0,num;
    for(int i=1;i<=n;i++){
        num=1;
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print(num--+"\t");
            else{
                if(space+k<n){
                    System.out.print(num+++"\t");
                }
                else{
                    System.out.print(num--+"\t");
                }
            }
        }
        star-=2;
        space++;
        System.out.println();
    }
   }     
}
