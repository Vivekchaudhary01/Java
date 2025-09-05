//                  1
//            2     1     3
//      4     5     1     6     7
// 8    9     10    1     11    12    13
//      14    15    1     16    17
//            18    1     19
//                  1


import java.util.Scanner;

public class DiamondNumberMid1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printDiamondNumberMid1(n);
   } 
   public static void printDiamondNumberMid1(int n){
    int star=1,num=2,mid=n/2,space=mid;
    for(int i=0;i<n;i++){
        for(int j=0;j<space;j++)
            System.out.print("\t");
        for(int k=0;k<star;k++){
            if(space+k==mid)
                System.out.print("1\t");
            else{
                System.out.print(num+++"\t");
            }
        }
        if(i<mid){
            star+=2;
            space--;
        }
        else{
            star-=2;
            space++;
        }
        System.out.println();
    }
   }      
}
