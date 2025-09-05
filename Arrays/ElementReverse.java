public class ElementReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printReversedArray(arr);
    }
    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}
