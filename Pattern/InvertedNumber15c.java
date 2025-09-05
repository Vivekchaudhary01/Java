//                                  15
//                          13      14
//                  12      11      10
//          6       7       8       9
//  5       4       3       2       1


import java.util.Scanner;

public class InvertedNumber15c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        printInvertedNumber15c(n);
    }
    public static void printInvertedNumber15c(int n){
        int star=1,space=n-1,num=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++){
                if(i%2==0)
                    System.out.print(num+++"\t");
                else 
                    System.out.print(num--+"\t");
            }
            space--;
            star++;
            if(i%2==0)
                num-=star;
            else
                num-=i;
            System.out.println();
        }
    }    
}
