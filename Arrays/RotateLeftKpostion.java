import java.util.Scanner;

public class RotateLeftKpostion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70};
        System.out.println("Original Array: ");
        printArray(a);
        System.out.print("Enter value of K:");
        int k=sc.nextInt();
        leftRotate(a,k);
        System.out.println("Left Rotate Array: ");
        printArray(a);
    }
    public static void leftRotate(int a[],int k){
        int n=a.length;
        k%=n;
        if(k==0) return;
        reverse(a, 0, n-1);
        reverse(a, 0, n-1-k);
        reverse(a, n-k, n-1);
    }
    public static void reverse(int a[],int start, int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }    
}
