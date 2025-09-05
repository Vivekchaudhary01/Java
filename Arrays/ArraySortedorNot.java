// WAJP to check whether a given array is in sorted order or not.

public class ArraySortedorNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        if (isSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
