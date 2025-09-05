//                                   1
//                           3       2
//                   4       5       6
//           10      9       8       7
//   11      12      13      14      15

import java.util.Scanner;

public class InvertedNumber1c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber1c(n);
    }
    public static void printInvertedNumber1c(int n){
        int star=1,space=n-1,num=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++){
                if(i%2==0) System.out.print(num--+"\t");
                else System.out.print(num+++"\t");
            }

            star++;
            space--;
            if(i%2==0) num+=star;
            else num+=i;
            System.out.println();
        }
    }    
}
