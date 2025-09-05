//      *     
//      *
//  * * * * *
//      *
//      *

import java.util.Scanner;

public class pluspattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();
        if(n%2==0)  System.out.println("Enter the Odd No.");
        else{
            int mid=n/2;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==mid||j==mid)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
