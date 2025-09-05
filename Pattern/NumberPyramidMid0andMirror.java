//                  0
//              1   0   1
//          2   1   0   1   2
//      3   2   1   0   1   2   3
//  4   3   2   1   0   1   2   3   4  

import java.util.Scanner;

public class NumberPyramidMid0andMirror {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramidMID0andMirror(n);
   } 
   public static void printNumberPyramidMID0andMirror(int n){
    int star=1,space=n-1,num,temp;
    for(int i=1;i<=n;i++){
        num=i-1;
        temp=1;
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print("0\t");
            else{
                if(space+k<n){
                    System.out.print(num--+"\t");
                }
                else{
                    System.out.print(temp+++"\t");
                }
            }
        }
        star+=2;
        space--;
        System.out.println();
    }
   }
}