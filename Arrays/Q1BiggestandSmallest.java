import java.util.Scanner;

public class Q1BiggestandSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] a=new int [n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        printBiggestandSmallest(a);
    }
    public static void printBiggestandSmallest(int[] a){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,diff=0;
        for(int i:a){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        diff=max-min;
        System.out.println("Biggest Element is: "+max+" and Smallest Element is: "+min);
        System.out.println("Difference is: "+diff);
    }
    
}