//                   1
//              2    1    2
//          3   2    1    2    3
//      4   3   2    1    2    3    4
//  5   4   3   2    1    2    3    4    5

import java.util.Scanner;

public class NumberPyramidMid1andMirror {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramidMID1andMirror(n);
   } 
   public static void printNumberPyramidMID1andMirror(int n){
    int star=1,space=n-1,num,temp;
    for(int i=1;i<=n;i++){
        num=i;
        temp=2;
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print("1\t");
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
