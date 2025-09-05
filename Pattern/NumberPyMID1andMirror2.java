//                 1
//             2   1   2
//         3   2   1   2   3
//     4   3   2   1   2   3   4
// 5   4   3   2   1   2   3   4   5    

import java.util.Scanner;

public class NumberPyMID1andMirror2 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printNumberPyramidMID1andMirror2(n);
   } 
   public static void printNumberPyramidMID1andMirror2(int n){
    int star=1,space=n-1,num;
    for(int i=1;i<=n;i++){
        num=i;
        for(int j=1;j<=space;j++)
            System.out.print("\t");
        for(int k=1;k<=star;k++){
            if(space+k==n)
                System.out.print(num+++"\t");

            else{
                if(space+k<n){
                    System.out.print(num--+"\t");
                }
                else{
                    System.out.print(num+++"\t");
                }
            }
        }
        star+=2;
        space--;
        System.out.println();
    }
   }     
}
