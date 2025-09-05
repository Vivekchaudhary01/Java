//          *
//        * * *
//      *   *   *
//    * * * * * * *
//      *   *   *
//        * * *
//          *
import java.util.Scanner;

public class HollowandCrossDiamondQ44{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        if(n%2==0)  System.out.println("Enter odd number.");
        else
        printHollowandCrossDiamondQ44(n);
    }
    public static void printHollowandCrossDiamondQ44(int n){
        int mid=n/2,a=mid,b=a;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==a||j==b||j==mid||i==mid)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                a--;
                b++;
            }
            else{
                a++;
                b--;
            }
            System.out.println();
        }
    }
}