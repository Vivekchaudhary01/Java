import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("Please enter an odd number for a proper butterfly pattern.");
            return;
        }
        printButterfly(n);
    }    
    public static void printButterfly(int n){
        int space=n-2,star=1,mid=n/2;
        for(int i=0;i<n;i++){
            if (i == mid) { // Special case for the middle row
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < star; j++) {
                    System.out.print("* ");
                }
                for (int k = 0; k < space; k++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < star; j++) {
                    System.out.print("* ");
                }
            }
            if(i<mid){
                star++;space-=2;
            }
            else{
                star--;space+=2;
            }
            System.out.println();
        }
    }
}
