//      *     * * * * 
//      *     *
//      *     *
//      * * * * * * *
//            *     *
//            *     *
//      * * * *     *

import java.util.Scanner;
public class Swastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Swastik pattern: ");
        int n=sc.nextInt();
        printSwastik(n);
    }
    public static void printSwastik(int n){
     if(n%2==0){
			System.out.println("Number of Rows Must Be Odd!!");
			return;
		}
		int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
	            if(i==mid||j==mid ||i==1&&j>mid ||j==n&&i>mid ||i==n &&j<mid ||j==1&&i<mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		    System.out.println();
		}
    }
}
