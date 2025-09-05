//  15 14 13 12 11 
//  7 8 9 10
//  6 5 4
//  2 3
//  1

import java.util.Scanner;

public class numberRevreseOrder15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int n=sc.nextInt();
        printNumberReverseOrder15(n);
    }    
    public static void printNumberReverseOrder15(int n) {
        int star=n,number=(n*(n+1))/2,temp;
        for(int i=1;i<=n;i++){
            temp=number;
            for(int j=1;j<=star;j++){
                if(i%2==1)
                {
                    System.out.print(number-- +" ");
                }
                else{
                    System.out.print(number++  + " ");
                }
            }
            star--;
            if(i%2==1)
            {
                number=number+1-star;
            }
            else{
                number=number-2-star;
            }
            System.out.println();   
        }
    }
}
