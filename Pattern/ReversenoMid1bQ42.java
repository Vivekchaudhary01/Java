//   1   2   3    4    1   5    6    7    8
//       9   10   11   1   12   13   14
//           15   16   1   17   18
//                19   1   20
//                     1
import java.util.Scanner;

public class ReversenoMid1bQ42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printReverseNoMID1bQ42(n);
     }
    public static void printReverseNoMID1bQ42(int n){
        int star=2*n-1,space=0,num=1;
        for(int i=0;i<n;i++){
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
