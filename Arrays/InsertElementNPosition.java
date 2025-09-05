import java.util.Scanner;

public class InsertElementNPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10]; 
        int size = 7; 
        a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50; a[5] = 60; a[6] = 70;

        System.out.println("Original Array:");
        printArray(a, size);

        System.out.println("Enter the position to insert:");
        int n = sc.nextInt();

        System.out.println("Enter the element:");
        int ele = sc.nextInt();

        insertElement(a, size, n, ele);
        size++; 
        System.out.println("Updated Array:");
        printArray(a, size);
    }

    public static void insertElement(int[] a, int size, int pos, int ele) {
        for (int i = size; i >= pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = ele; 
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
