import java.util.Scanner;

public class SpiralMatrixNumberQ45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        printSpiralMatrixNumber(n);    
    }
    public static void printSpiralMatrixNumber(int n){
        int num=1;
        int a[][]=new int[n][n];
        int top=0, bottom=n-1, left=0, right=n-1;
        while(num<=n*n){
            for(int i=left;i<=right;i++)
                a[top][i]=num++;
            top++;
            for(int i=top;i<=bottom;i++)
                a[i][right]=num++;
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    a[bottom][i]=num++;
                    bottom--;
             }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    a[i][left]=num++;
                left++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
        System.out.println();
        }
    }
}
