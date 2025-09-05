// 15 14 13 12 11 
// 10 9 8 7 
// 6 5 4 
// 3 2 
// 1

import java.util.Scanner;

public class numberReverse {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printNumberReverse10(n);
   } 
   public static void printNumberReverse10(int n) {
        int star=n,number=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++)
                System.out.print(number--+" ");
            star--;
            System.out.println();
        }
   }
}
