//   1   2   3   4   1   5   6   7   8
//       1   2   3   1   4   5   6
//           1   2   1   3   4
//               1   1   2
//                   1

import java.util.Scanner;

public class ReverseNoMID1Q41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printReverseNoMID1Q41(n);
    }
    public static void printReverseNoMID1Q41(int n){
        int star=2*n-1,space=0,num;
        for(int i=0;i<n;i++){
            num=1;
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=1;k<=star;k++){
                if(space+k==n)
                    System.out.print("1\t");
                else    
                    System.out.print(num+++"\t");
            }
            star-=2;
            space++;
            System.out.println();
        }
    }
}
