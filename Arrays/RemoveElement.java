import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30,40,50,60,70};
        int size=a.length;
        System.out.println("Original Array:");
        printArray(a,size);
        System.out.println("Enter the position u want to remove:");
        int n=sc.nextInt();
        RemoveElement(a,n);
        System.out.println("Updated Array: ");
        printArray(a,size-1);
    } 
    public static void RemoveElement(int[] a,int n){
        int pos=n-1;
        while (pos<a.length-1) {
            a[pos]=a[pos+1];
            pos++;
        }
    }

    public static void printArray(int[] arr,int size) {
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
}
