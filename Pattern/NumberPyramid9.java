//                  9
//          8       7       6
//  5       4       3       2       1

import java.util.Scanner;

public class NumberPyramid9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramid(n);
    }    
    public static void printNumberPyramid(int n){
        int star=1,space=n-1,num=n*n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int k=1;k<=star;k++)
                System.out.print(num--+"\t");
            star+=2;
            space--;
            System.out.println();
        }
    }    
}
