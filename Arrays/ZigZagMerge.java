// WAJP to zigzag merge two arrays into a single array.
// i/p: 
// arr1 = {20, 30, 50}
// arr2 = {2, 4, 6, 8, 10}
// merged: {20, 2, 30, 4, 50, 6, 8, 10}

public class ZigZagMerge {
    public static void main(String[] args) {
        int[] arr1 = {20, 30, 50};
        int[] arr2 = {2, 4, 6, 8, 10};
        int n = arr1.length + arr2.length;
        int[] merged = new int[n];
        zigzagMerge(arr1, arr2, merged);
        System.out.print("Zigzag Merged Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(merged[i] + " ");
        }
    }
    public static void zigzagMerge(int[] arr1, int[] arr2, int[] merged) {
        int i = 0, j = 0, k = 0;
        boolean takeFromArr1 = true; // Flag to alternate between arrays

        while (i < arr1.length && j < arr2.length) {
            if (takeFromArr1) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
            takeFromArr1 = !takeFromArr1; // Toggle the flag
        }

        // If there are remaining elements in arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
    }
}
