//  * * * * 
//  * * *
//  * *
//  *

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star--;
            System.out.println();
        }
    }
}
