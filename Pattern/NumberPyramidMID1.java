//                          1
//                  1       1       2
//          3       4       1       5       6
//  7       8       9       1       10      11      12

import java.util.Scanner;

public class NumberPyramidMID1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramidMID1(n);
   } 
   public static void printNumberPyramidMID1(int n){
    int star=1,space=n-1,num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print("1\t");
            else    
                System.out.print(num+++"\t");
        }
        star+=2;
        space--;
        System.out.println();
    }
   }
}
