//  15      14      13      12      11
//          10      9       8       7
//                  6       5       4
//                          3       2
//                                  1

import java.util.Scanner;

public class InvertedNoTriangle15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        InverterNoTraingle15(n);
    }   
    public static void InverterNoTraingle15(int n){
        int space=0,number=15,star=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=1;k<=star;k++)
                System.out.print(number-- +"\t");
            
            space++;star--;
            System.out.println();
        }
    }    
}
