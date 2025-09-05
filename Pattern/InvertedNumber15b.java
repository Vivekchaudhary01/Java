//                                   15
//                           13      14
//                   10      11      12
//           6       7       8       9
//   1       2       3       4       5


import java.util.Scanner;

public class InvertedNumber15b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber15b(n);
    }
    public static void printInvertedNumber15b(int n){
        int star=1,space=n-1,num=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print(num+++"\t");
            space--;
            star++;
            num-=(2*star-1);
            System.out.println();
        }
    }
}
