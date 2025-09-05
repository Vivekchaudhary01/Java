import java.util.Scanner;

public class Mixed3EarCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        n=7;
        printMixed3EarCone(n);
    }    
    public static void printMixed3EarCone(int n){
        int sSpace=n/2,mid=n/2,space=3,star=1,sStar=1,eStar=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=7;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print("* ");
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=sStar;j++)
                System.out.print("* ");
            for(int j=5;j<=11;j++)
                System.out.print("  ");
            for(int j=11;j<=eStar;j++)
                System.out.print("* ");
            
            if(i<mid){  
                star+=2;
                space--;
            } else {
                star--;
                space+=2;
                sStar--;
            }
            System.out.println();
        }
    }    
}
