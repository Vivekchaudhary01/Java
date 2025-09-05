
//             *
//           *   *
//         *   *   *
//       *   *   *   *
//     *   *   *   *   *
//   *   *   *   *   *   *

import java.util.Scanner;

public class PyramidSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printSpacePyramid(n);
    }
    public static void printSpacePyramid(int n){
        int star=1,space=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++)
                System.out.print("  ");
            for(int k=0;k<2*star-1;k++){
                if(k%2==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            star++;space--;
            System.out.println();
        }
    }
}
