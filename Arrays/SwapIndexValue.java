public class SwapIndexValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: ");
        printArray(arr);
        
        swapIndexValue(arr, 1, 3); // Swap values at index 1 and index 3
        
        System.out.println("Array after swapping index 1 and index 3: ");
        printArray(arr);
    }
    public static void swapIndexValue(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) {
            System.out.println("Invalid indices for swapping.");
            return;
        }
        // Swap the values at the specified indices
        arr[index1]=arr[index1] + arr[index2]-(arr[index2]=arr[index1]);
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
