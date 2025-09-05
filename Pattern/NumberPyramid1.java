//                  1
//          2       3       4
//  5       6       7       8       9

import java.util.Scanner;

public class NumberPyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramid(n);
    }    
    public static void printNumberPyramid(int n){
        int star=1,space=n-1,num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int k=1;k<=star;k++)
                System.out.print(num+++"\t");
            star+=2;
            space--;
            System.out.println();
        }
    }
}
