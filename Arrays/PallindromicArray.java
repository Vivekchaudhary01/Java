import java.util.Scanner;

public class PallindromicArray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,30,20,10};
        System.out.println("Original Array:");
        printArray(a);
        if(PallindromicArray(a))
            System.out.println("true");
        else 
            System.out.println("false");
    }
    public static boolean PallindromicArray(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]!=a[j])
                return false;
            i++;
            j--;
        }
        return true;

    } 
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}